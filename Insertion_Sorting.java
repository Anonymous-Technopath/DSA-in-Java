/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Insertion Sorting
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 

public class Insertion_Sorting {

	public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i-1;
			for(;j>=0;j--){
				if(arr[j]>temp){
					arr[j+1]=arr[j];
				}
				else{
					break;
				}
			}
			arr[j+1]=temp;
   		}
	}
}
