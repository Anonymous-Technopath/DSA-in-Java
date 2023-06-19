/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find nth elements of spiral matrix
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Find_Nth_Elements_Of_Spiral_Matrix {

	public static int findKthElement(int[][] matrix, int k) {
	    // Write your code here.
		int count = 0,ans = -1;
		boolean t =false;
		int n = matrix.length, m= matrix[0].length;
        int top = 0,bottom = n-1, left = 0 , right = m-1;
        while(top<=bottom && left <= right){
            for(int j=left;j<=right;j++){
				count++;
				ans=matrix[top][j];
				if(count==k){
					return ans;
				}
            }
            top++;
            if(top>bottom || left > right){
                break;
            }
            for(int i=top;i<=bottom;i++){
				count++;
				ans = matrix[i][right];
				if(count==k){
					return ans;
				}
            }
            right--;
            if(top>bottom || left > right){
                break;
            }
            for(int j=right;j>=left;j--){
				count++;
				ans = matrix[bottom][j];
				if(count==k){
					return ans;
				}
            }
            bottom--;
            if(top>bottom || left > right){
                break;
            }
            for(int i=bottom;i>=top;i--){
				count++;
				ans = matrix[i][left];
				if(count==k){
					return ans;
				}
            }
            left++;
        }
        return ans;
	}
}
