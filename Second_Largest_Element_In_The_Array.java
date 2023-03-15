/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Second Largest Element In The Array
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Second_Largest_Element_In_The_Array {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++){
			if(max2<arr[i]&& arr[i]!=max){
				max2=arr[i];
			}
		}
		if(max2==Integer.MIN_VALUE){
			return -1;
		}
		return max2;
	}
}
