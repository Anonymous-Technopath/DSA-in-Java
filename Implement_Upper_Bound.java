/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Implement Upper Bound
*Problem Source : Coding Ninjas
* 
*/

public class Implement_Upper_Bound {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here
        int start=0,end=n-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start + (end-start)/2;
            if(arr[mid]<=x){
                start=mid+1;                  
            }
            else{  
                end=mid-1;           
            }
        }
        // while(mid<n-1 && arr[mid]>=x){
        //     mid++;
        // }
        return start;
    }
}
