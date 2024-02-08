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

    // USING STACK
    
    // public static long getTrappedWater(long []arr, int n) {
    //     // Write your code here.
    //     Stack<Long> s=new Stack<>();
    //     s.push(arr[0]);
    //     long max=arr[0],sum=0;
    //     for(int i=1;i<n;i++){
    //         if(arr[i]>=max){
    //             while(s.peek()!=max){
    //                 sum+=(max-s.pop());
    //             }
    //             s.pop();
    //             s.push(arr[i]);
    //             max=arr[i];
    //         }else{
    //             s.push(arr[i]);
    //         }
    //     }
    //     max=s.pop();
    //     while(!s.isEmpty()){
    //         if(s.peek()>=max){
    //             max=s.pop();
    //         }else{
    //             sum+=(max-s.pop());
    //         }
    //     }
    //     return sum;

    // }
}
