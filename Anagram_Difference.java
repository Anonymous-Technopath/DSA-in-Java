/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Anagram Difference
*Problem Source : Coding Ninjas
* 
*/

public class Anagram_Difference {
	public static int getMinimumAnagramDifference(String str1, String str2) {
		// Write your code here.
		int a[]=new int[26];
		int b[]=new int[26];
		for(int i=0;i<str1.length();i++){
			a[str1.charAt(i)-'a']++;
			b[str2.charAt(i)-'a']++;
		}
		int count=0;
		for(int i=0;i<26;i++){
			count+=Math.abs(a[i]-b[i]);
		}
		
		return count/2;
	}
}
