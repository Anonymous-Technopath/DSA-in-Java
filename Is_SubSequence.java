/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Is SubSequence
*Problem Source : Coding Ninjas
* 
*/

public class Is_SubSequence {

	public static String isSubsequence(String str1, String str2) {    
    	// Write your code here.	
		int a=0,b=0;
		while(a<str1.length() && b<str2.length()){
			if(str1.charAt(a)==str2.charAt(b)){
				a++;
				b++;
				continue;
			}
			b++;
		}
		if(a!=str1.length()){
			return "False";
		}
		return "True";
	}

}
