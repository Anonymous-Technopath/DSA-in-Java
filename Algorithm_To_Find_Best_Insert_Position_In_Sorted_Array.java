/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Algorithm to find best insert position in sorted array
*Problem Source : Coding Ninjas
* 
*/

public class Algorithm_To_Find_Best_Insert_Position_In_Sorted_Array {	
	public static int bestInsertPos(int [] arr, int n, int m){
		// Write your code here.
	    int start = 0,end = n-1;
		int mid = start+(end-start)/2;
		while(start<=end){
			if(arr[mid]==m){
				return mid;
			}else if(arr[mid]<m){
				start = mid+1;
			}else{
				end=mid-1;
			}
			mid = start+(end-start)/2;
		}
		return mid;
	}
}
