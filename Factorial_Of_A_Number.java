/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Factorial of a Number
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/factorial-of-a-number_1115779
* 
*/

import java.util.*;
class Factorial_Of_A_Number{
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0){
			System.out.println("Error");
		}else{
			int x=1;
			for(int i=2;i<=n;i++){
				x=x*i;
			}
			System.out.println(x);
		}
	}
}
