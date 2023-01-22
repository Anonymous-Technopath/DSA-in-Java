/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Valid Palindrome
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/valid-palindrome/
* 
*/

class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String k="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<=122 && s.charAt(i)>=97){
                k=k+s.charAt(i);
            }
            else if(s.charAt(i)<=90 && s.charAt(i)>=65){
                k=k+(s.charAt(i)+"").toLowerCase();
            }
            else if(s.charAt(i)<=57 && s.charAt(i)>=48){
                k=k+s.charAt(i);
            }
        }
        StringBuffer sb=new StringBuffer(k);
        return (sb.reverse().toString()).equals(k); 
    }
}
