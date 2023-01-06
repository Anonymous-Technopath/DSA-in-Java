/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Valid Parentheses
*Problem Source : LeetCode
*Problem Link : https://leetcode.com/problems/valid-parentheses/
* 
*/

class Valid_Parentheses {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
        return false;
        ArrayList<Character> arr=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                arr.add(s.charAt(i));
            }
            else{
                char c;
                if(s.charAt(i)=='}')
                c='{';
                else if(s.charAt(i)==')')
                c='(';
                else
                c='[';
                if(arr.size()!=0 && arr.get(arr.size()-1)==c){
                    arr.remove(arr.size()-1);
                }
                else{
                    return false;
                }
            }
        }
        if(arr.size()==0){
            return true;
        }
        return false;
    }
}
