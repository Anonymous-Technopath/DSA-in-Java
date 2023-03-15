/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Print the array after K operations
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Print_The_Array_After_K_Operations {

	public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {
	
	   // Write your code here.
	   if(k==0){
		   return arr;
	   }
	    int max=Collections.max(arr);
	    for(int i=0;i<n;i++){
		    arr.set(i,max-arr.get(i));
	    }
	    max=Collections.max(arr);
	    k--;
	    if(k%2==0){
		    return arr;
	    }else{
		    for(int i=0;i<n;i++){
		    	arr.set(i,max-arr.get(i));
	    	} 
	    }
	   return arr;
	}
}
