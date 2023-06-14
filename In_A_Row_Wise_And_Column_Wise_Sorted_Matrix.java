/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Search In A Row Wise And Column Wise Sorted Matrix
*Problem Source : Coding Ninjas
* 
*/

public class Search In_A_Row_Wise_And_Column_Wise_Sorted_Matrix {
	public static Pair search(int [][] matrix, int x) {
        int i = 0;
        int j = matrix[0].length - 1;
        while( i < matrix.length && j >= 0){
            if(x == matrix[i][j]){
                return new Pair(i,j);
            }else if (x < matrix[i][j]){
                j--;
            }else
                i++;
        }
        return new Pair(-1,-1);
	}
}
