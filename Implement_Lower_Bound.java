/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Implement Lower Bound
*Problem Source : Coding Ninjas
* 
*/

public class Implement_Lower_Bound {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int start=0,end=n-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start + (end-start)/2;
            if(arr[mid]>=x){
                end=mid-1;
            }
            else{
                start=mid+1;               
            }
        }
        // while(mid<n-1 && arr[mid]>=x){
        //     mid++;
        // }
        return start;
    }
}
