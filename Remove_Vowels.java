/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Vowels
*Problem Source : Coding Ninjas
* 
*/

public class Remove_Vowels {
	public static String removeVowels(String str) {
	 // Write your code here.
	 StringBuilder sb=new StringBuilder(str);
	 HashSet<Character> hs=new HashSet<>();
	 hs.add('a');
	 hs.add('e');
	 hs.add('i');
	 hs.add('o');
	 hs.add('u');
	 hs.add('A');
	 hs.add('E');
	 hs.add('I');
	 hs.add('O');
	 hs.add('U');
	 for(int i=str.length()-1;i>=0;i--){
		 if(hs.contains(str.charAt(i))){
			 sb.deleteCharAt(i);
		 }
	 }
	 return sb.toString();
	}
}
