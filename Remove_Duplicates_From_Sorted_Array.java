/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Duplicates from Sorted Array
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Remove_Duplicates_From_Sorted_Array {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		if(n<=1){
			return n;
		}
		int a=arr.get(0);
		for(int i=1;i<n;i++){
			if(a==arr.get(i)){
				arr.remove(i);
				i--;
				n--;
				continue;
			}
			a=arr.get(i);
		}
		return n;
	}
}
