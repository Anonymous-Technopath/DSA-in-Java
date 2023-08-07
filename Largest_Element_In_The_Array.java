/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Largest Element in the Array
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 

public class Largest_Element_In_The_Array {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
