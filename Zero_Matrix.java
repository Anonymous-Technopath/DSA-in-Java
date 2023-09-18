/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Zero Matrix
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Zero_Matrix {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> arr, Integer n, Integer m) {
    	// Write your code here.
        int x[]=new int[arr.get(0).size()];
        int y[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                if(arr.get(i).get(j)==0){
                    y[i]=1;
                    x[j]=1;
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                if(x[j]==1||y[i]==1){
                    arr.get(i).set(j,0);
                }
            }
        }
        return arr;
    }
}
