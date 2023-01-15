/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Missing and repeating numbers
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/missing-and-repeating-numbers_873366
* 
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Missing_And_Repeating_Numbers {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        
        int[] x=new int[2];
        int sum=0;
        for(int i=0;i<n;i++){
            if(!arr.contains(i+1)){
                x[0]=i+1;
            }
            sum+=arr.get(i);
        }
        x[1]=sum-(n*(n+1)/2)+x[0];
        return x;
    }
}
