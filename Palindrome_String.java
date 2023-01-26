/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Palindrome String
*Problem Source : Geeks For Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/palindrome-string0817/
* 
*/

class Palindrome_String{
    int isPalindrome(String S) {
        // code here
        StringBuffer sb=new StringBuffer(S);
        if(sb.reverse().toString().equals(S)){
            return 1;
        }
        return 0;
    }
}
