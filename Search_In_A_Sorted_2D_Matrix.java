/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Search In A Sorted 2D Matrix
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Search_In_A_Sorted_2D_Matrix {
    public static boolean BS(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }

    public static boolean searchElement(int [][]mat, int target) {
        // Write your code here.
        int start=0;
        int end=mat.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mat[mid][0]==target){
                return true;
            }
            else if(mat[mid][0]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return BS(mat[end],target);
    }
}
