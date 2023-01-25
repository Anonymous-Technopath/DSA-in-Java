/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find Character Case
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/find-character-case_1115655
* 
*/


class Find_Character_Case{
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)<=122 && s.charAt(0)>=97){
			System.out.println(0);
		}
		else if(s.charAt(0)<=90 && s.charAt(0)>=65){
			System.out.println(1);
		}
		else{
			System.out.println(-1);
		}
		
	}
}
