/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Generate Parentheses
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/generate-parentheses/
*/

class Generate_Parentheses {
    
    public void rec(ArrayList<String> arr,String s,int n,int m){
        if(n==0 &&m==0){
            if(!arr.contains(s)){
                arr.add(s);
                return;
            }
        }
        if(n==0){
            rec(arr,s+")",n,m-1);
        }
        if(n>0){
            rec(arr,s+"(",n-1,m);
        }
        if(n<m && n>0){
            rec(arr,s+")",n,m-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<String>();
        rec(arr,"",n,n);
        return arr;
    }
}
