/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Fahrenheit to Celsius
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/fahrenheit-to-celsius_624931
* 
*/

import java.util.Scanner;
public class Fahrenheit_To_Celsius {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		for(int i=start;i<=end;i+=step){
			int x=(i-32)*5/9;
			System.out.println(i+" "+x);
		}
	}

}
