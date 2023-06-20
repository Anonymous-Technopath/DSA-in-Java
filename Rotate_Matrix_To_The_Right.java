/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Rotate matrix to the right
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Rotate_Matrix_To_The_Right {
	public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
		// Write your code here.
		k=k%m;
		if(k==0){
			return mat;
		}
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=k;j<m;j++){
				arr[i][j] = mat[i][j-k]; 
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<k;j++){
				arr[i][j] = mat[i][m-k+j]; 
			}
		}
		return arr;
	}
}
