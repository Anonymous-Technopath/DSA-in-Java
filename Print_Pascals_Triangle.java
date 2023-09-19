/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Print Pascal’s Triangle
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;

public class Print_Pascals_Triangle {

    public static int[][] pascalTriangle(int N) {

        // Write your code here.

        int[][] p = new int[N][];

        for(int i =0; i<N; i++){

         p[i] = new int[i+1]; // arry of array containes different size so that's why 

         p[i][0]=1;// in passcal t in each row first row or first element and last ele of row should be 1

         p[i][i]=1;

         for(int j =1; j<i; j++){

             p[i][j]=p[i-1][j]+p[i-1][j-1];     // p diffintaion or elem sum of next up elemt or next up left ele

         }

        }

        return p;

    }

}
