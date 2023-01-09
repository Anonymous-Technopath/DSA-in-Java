/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse words in a given string
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/
* 
*/

class Reverse_words_in_a_given_string 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        StringTokenizer st=new StringTokenizer(S,".");
        String rev="";
        while(st.hasMoreTokens()){
            rev=st.nextToken()+"."+rev;
        }
        return rev.substring(0,rev.length()-1);
    }
}
