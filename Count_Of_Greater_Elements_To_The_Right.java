/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Of Greater Elements To The Right
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Count_Of_Greater_Elements_To_The_Right {
    public static int[] countGreater(int []arr, int []query) {
        // Write your code here.
        int sol[]=new int[query.length];
        for(int i=0;i<query.length;i++){
            for(int j=query[i];j<arr.length;j++){
                if(arr[j]>arr[query[i]]){
                    sol[i]++;
                }
            }
        }
        return sol;
    }
}
