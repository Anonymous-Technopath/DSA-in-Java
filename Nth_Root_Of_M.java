/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Nth Root Of M
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/nth-root-of-m_1062679
* 
*/

public class Nth_Root_Of_M {
	public static double findNthRootOfM(int n, int m) {
		// Write your code here.
		return Math.pow(m,1/(double)n);
	}
}
