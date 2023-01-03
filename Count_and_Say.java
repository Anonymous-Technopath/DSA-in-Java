/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count and Say
*Problem Source : Leetcode
*Problem Link : https://leetcode.com/problems/count-and-say/
* 
*/

class Count_and_Say {
    public String countAndSay(int n) {
        String s="1";
        int x=n;
        for(int i=1;i<n;i++){
            char c=s.charAt(0);
            int count=0;
            String k="";
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    count++;
                }
                else{
                    k=k+count+c;
                    count=0;
                    c=s.charAt(j);
                    j--;
                }
            }
            k=k+count+c;
            s=k;
        }
        return s;
    }
}
