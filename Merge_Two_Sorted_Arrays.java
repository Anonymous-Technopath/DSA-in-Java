/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Merge Two Sorted Arrays
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/ninja-and-sorted-arrays_1214628
* 
*/

public class Merge_Two_Sorted_Arrays {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=arr1[i];
        }
        int i=0,j=0,x=0;
        while(i<m && j<n){
            if(arr[i]<=arr2[j]){
                arr1[x]=arr[i];
                i++;
                x++;
            }else{
                arr1[x]=arr2[j];
                j++;
                x++;
            }
        }
        if(i<m){
            while(i<m){
                arr1[x]=arr[i];
                i++;
                x++;
            }
        }else if(j<n){
            while(j<n){
                arr1[x]=arr2[j];
                j++;
                x++;
            }
        }
        return arr1;
    }
}
