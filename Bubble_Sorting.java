/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Bubble Sort
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 

public class  Bubble_Sorting {
    
    public static void bubbleSort(int[] arr, int n) {   
        // Write your code here.
         for(int i=1;i<n;i++){

        //for round 1 to n-1

        boolean swapped=false;

        for(int j=0;j<n-i;j++){

            if(arr[j]>arr[j+1]){

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                swapped=true;

            }

        }

        if(swapped==false){

            //already sorted

            break;

        }
         }

    
    }

}
