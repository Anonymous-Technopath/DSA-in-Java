/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Kadane's Algorithm
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/
* 
*/

  class Kadanes_Algorithm{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        if(n==0)
        return 0;
        int maximum=arr[0];
        // Your code here
        long cur=0;
        long max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maximum)
            maximum=arr[i];
            cur+=arr[i];
            if(cur>max){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        if(max==0)
        return maximum;
        return max;
    }
    
}
