/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Ceil The Floor
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Ceil_The_Floor {
    public static int floor(int n, int x, int[] arr){
        Arrays.sort(arr);
        int start=0,end=n-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]<=x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        try{
            x = arr[end];
        }
        catch(Exception e){
            x = -1;
        }
        return x;
    }
    public static int ceil(int n, int x, int[] arr){
        Arrays.sort(arr);
        int start=0,end=n-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]>=x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        try{
            x = arr[start];
        }
        catch(Exception e){
            x = -1;
        }
        return x;
    }
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        System.out.print(floor(n,x,arr)+" ");
        return ceil(n,x,arr);
    }
}
