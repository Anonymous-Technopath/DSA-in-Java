/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Matrix Is Symmetric
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Matrix_Is_Symmetric {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
