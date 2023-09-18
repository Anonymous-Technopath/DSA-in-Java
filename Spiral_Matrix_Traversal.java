/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Spiral Matrix
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Spiral_Matrix_Traversal {
    public static int[] spiralMatrix(int [][]mat) {
        // Write your code here.
        int arr[]=new int[mat.length*mat[0].length];
        int x=0;
        int L=0,R=mat[0].length-1,T=0,B=mat.length-1;
        while(L<=R && T<=B){
            for(int i=L;i<=R;i++){
                arr[x]=mat[T][i];
                x++;
            }
            T++;
            if(!(L<=R)||!(T<=B)){
                return arr;
            }
            for(int i=T;i<=B;i++){
                arr[x]=mat[i][R];
                x++;
            }
            R--;
            if(!(L<=R)||!(T<=B)){
                return arr;
            }
            for(int i=R;i>=L;i--){
                arr[x]=mat[B][i];
                x++;
            }
            B--;
            if(!(L<=R)||!(T<=B)){
                return arr;
            }
            for(int i=B;i>=T;i--){
                arr[x]=mat[i][L];
                x++;
            }
            L++;
            if(!(L<=R)||!(T<=B)){
                return arr;
            }
        }
        return arr;
    }
}
