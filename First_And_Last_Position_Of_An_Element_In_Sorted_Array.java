/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : First and Last Position of an element in Sorted Array
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/first-and-last-position-of-an-element-in-sorted-array_839724
* 
*/

public class First_And_Last_Position_Of_An_Element_In_Sorted_Array {
	public static Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
		// Write your code here.
		Pair y=new Pair();
		y.first=arr.indexOf(x);
		y.second=arr.lastIndexOf(x);
		return y;
	}
}
