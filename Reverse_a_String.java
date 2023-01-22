/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse a String
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string/
* 
*/

class Reverse_a_String
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuffer sb=new StringBuffer(str);
        return sb.reverse().toString();
    }
}
