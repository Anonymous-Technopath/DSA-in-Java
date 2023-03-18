/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : First Unique Character in a String
*Problem Source : Coding Ninjas
* 
*/

public class First_Unique_Character_In_A_String {
	public static char firstNonRepeating(String str) {
		// Write your code here
		HashSet<Character> hs=new HashSet<>();
		ArrayList<Character> arr=new ArrayList<>();
		for(int i=0;i<str.length();i++){
			if(arr.contains(str.charAt(i))){
				arr.remove(arr.indexOf(str.charAt(i)));
			}
			if(!hs.contains(str.charAt(i))){
				hs.add(str.charAt(i));
				arr.add(str.charAt(i));
			}
			
		}
		for(char c:arr){
			return c;
		}
		return '#';
	}
}
