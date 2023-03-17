/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Encode the Message
*Problem Source : Coding Ninjas
* 
*/

public class Encode_The_Message {
	public static String encode(String message) {
		// Write your code here.
		char c=message.charAt(0);
		int count=0;
		StringBuilder s=new StringBuilder();
		s.append(c);
		for(int i=0;i<message.length();i++){
			if(message.charAt(i)==c){
				count++;
			}
			else{
				s.append(count);
				count=1;
				c=message.charAt(i);
				s.append(c);
			}
		}
		s.append(count);
		return s.toString();
	}
}
