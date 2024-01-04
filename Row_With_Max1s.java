/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Row with max 1s
*Problem Source : Coding Ninjas
* 
*/

import java.util.ArrayList;
public class Row_With_Max1s
{

    public static int count(ArrayList<Integer> arr,int m){
        int start=0;
        int end=m-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr.get(mid)==1){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(ans==-1){
            return 0;
        }
        return m-ans;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> arr, int n, int m)
    {
        //	  Write your code here.
        int max=0;
        int maxval=0;
        for(int i=0;i<n;i++){
            if(arr.get(i).get(0)==1){
                return i;
            }
            int x=count(arr.get(i),m);
            if(x>maxval){
                maxval=x;
                max=i;
            }
        }
        return max;
    }
}
