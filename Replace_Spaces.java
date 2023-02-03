/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Replace Spaces
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/replace-spaces_1172172
* 
*/

public class Replace_Spaces{
	public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                str.replace(i, i + 1,"@40");
            }
        }
        return str;
	
	}
}
