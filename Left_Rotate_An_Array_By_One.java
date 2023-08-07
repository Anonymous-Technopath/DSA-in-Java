/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Left Rotate an Array by One
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 


public class Left_Rotate_An_Array_By_One {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int a=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=a;
        return arr;
    }
}
