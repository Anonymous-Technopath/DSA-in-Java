/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count All Subarrays With Given Sum
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Count_All_Subarrays_With_Given_Sum {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    
        int count=0;
        int l=0,r=0;
        int sum=0;
        while(l<=r && r<=arr.length){
            if(sum==s){
                count++;
                if(r==arr.length){
                    break;
                }
                sum+=arr[r++];
                continue;
            }
            
            if(sum<s){
                if(r==arr.length){
                    break;
                }
                sum+=arr[r++];
            }else{
                sum-=arr[l++];
            }
        }
        return count;
    }
}
