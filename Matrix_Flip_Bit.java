/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Matrix Flip Bit
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Matrix_Flip_Bit{
	public static int countFlip(int[][] mat) {
		// Write your code here.
		int n=mat.length;
		int col[] = new int[n];
		int row[] = new int[n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j]==0){
					col[i]=1;
					row[j]=1;
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((col[i]==1 || row[j]==1 )&& mat[i][j]!=0){
					mat[i][j]=0;
					count++;
				}
			}
		}
		return count;
	}
}

