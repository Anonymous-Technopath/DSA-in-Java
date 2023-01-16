/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse Words In A String
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/reverse-words_696444
* 
*/

import java.util.*;
public class Reverse_Words_In_A_String
{
	public static String reverseString(String str) 
	{
		//Write your code here
        StringTokenizer st=new StringTokenizer(str);
        String s="";
        while(st.hasMoreTokens()){
            s=st.nextToken()+" "+s;
        }
        return s.substring(0,s.length()-1);
	}
}
