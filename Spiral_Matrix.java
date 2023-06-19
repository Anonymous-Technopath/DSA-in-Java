/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Spiral Matrix
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Spiral_Matrix {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        // Write you code here.
        List<Integer> sol =new ArrayList<>();
        int top = 0,bottom = n-1, left = 0 , right = m-1;
        while(top<=bottom && left <= right){
            for(int j=left;j<=right;j++){
                sol.add(matrix[top][j]);
            }
            top++;
            if(top>bottom || left > right){
                break;
            }
            for(int i=top;i<=bottom;i++){
                sol.add(matrix[i][right]);
            }
            right--;
            if(top>bottom || left > right){
                break;
            }
            for(int j=right;j>=left;j--){
                sol.add(matrix[bottom][j]);
            }
            bottom--;
            if(top>bottom || left > right){
                break;
            }
            for(int i=bottom;i>=top;i--){
                sol.add(matrix[i][left]);
            }
            left++;
        }
        return sol;
        
    }
}
