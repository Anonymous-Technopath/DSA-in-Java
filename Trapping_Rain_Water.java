/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Trapping Rain Water
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/
* 
*/

class Trapping_Rain_Water{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        if(n<=2){
            return 0;
        }
        long sum=0;
        int l=0,r=n-1;
        long ml=arr[0];
        long mr=arr[n-1];
        while(l<=r){
            if(ml<mr){
                if(arr[l]<=ml){
                    sum=sum+ml-arr[l];
                }else{
                    ml=arr[l];
                }
                l++;
            }else{
                if(arr[r]<=mr){
                    sum=sum+mr-arr[r];
                }else{
                    mr=arr[r];
                }
                r--;
            }
        }
        return sum;
    } 
}
