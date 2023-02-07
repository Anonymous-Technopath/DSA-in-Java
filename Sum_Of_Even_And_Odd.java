/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum of even & odd
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/sum-of-even-odd_1115708
* 
*/

import java.util.Scanner;
class Sum_Of_Even_And_Odd{
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		while(n>0){
			if(n%10%2==0){
				even+=n%10;
			}else{
				odd+=n%10;
			}
			n=n/10;
		}
		System.out.println(even+" "+odd);
	}
}
