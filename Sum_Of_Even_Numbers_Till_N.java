/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum Of Even Numbers Till N
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/sum-of-even-numbers-till-n_893205
* 
*/

public class Sum_Of_Even_Numbers_Till_N {
	public static long evenSumTillN(int n) {
		// Write your code here.
		n=n/2;
		return (long)n*(n+1);
	}
}
