/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Average Marks
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/average-marks_893183
* 
*/

public class Average_Marks {
	public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
		// Write your code here.
		return new Pair(firstLetterOfName,(m1+m2+m3)/3);
	}
}
