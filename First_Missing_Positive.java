/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : First Missing Positive
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/first-missing-positive_699946
* 
*/

import java.util.* ;
import java.io.*; 
public class First_Missing_Positive {
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.	
        int x[]=new int[n+2];
        for(int i=0;i<n;i++){
            if(arr[i]>=0 && arr[i]<n+2){
                x[arr[i]]=1;
            }
        }
        for(int i=1;i<n+2;i++){
            if(x[i]!=1){
                return i;
            }
        }
        return n+2;
	}
}
