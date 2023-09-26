/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : First and Last Position of an Element In Sorted Array
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class First_And_Last_Position_Of_An_Element_in_Sorted_Array {
    public static int floor(int n, int x, ArrayList<Integer> arr){
        int start=0,end=n-1;
        int mid = start+(end-start)/2;
        try{
            while(start<=end){
                mid = start+(end-start)/2;
                if(arr.get(mid)<=x){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            if(arr.get(end)!=x)
                return -1;
        }catch(Exception e){
            return -1;
        }
        return end;
    }
    public static int ceil(int n, int x, ArrayList<Integer> arr){
        int start=0,end=n-1;
        int mid = start+(end-start)/2;
        try{
            while(start<=end){
                mid = start+(end-start)/2;
                if(arr.get(mid)>=x){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            if(arr.get(start)!=x)
                return -1;
        }catch(Exception e){
            return -1;
        }
        return start;
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int x[]=new int[2];
        x[0] = ceil(n,k,arr);
        x[1] = floor(n,k,arr);
        return x;
    }

};
