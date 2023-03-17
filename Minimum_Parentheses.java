/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Minimum Parentheses
*Problem Source : Coding Ninjas
* 
*/

public class Minimum_Parentheses {
	public static int minimumParentheses(String pattern) {
		// Write your code here.
		int a=0,b=0;
		for(int i=0;i<pattern.length();i++){
			if(pattern.charAt(i)=='('){
				a++;
			}else{
				if(a==0){
					b++;
				}else{
					a--;
				}
			}
		}
		return a+b;
	}
}
