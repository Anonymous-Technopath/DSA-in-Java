/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subset Sum
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Subset_Sum {
    public static void rec(int nums[],int i,int sum, ArrayList<Integer> arr){
        if(i==nums.length){
            return;
        }
        rec(nums,i+1,sum,arr);
        rec(nums,i+1,sum+nums[i],arr);
        arr.add(sum+nums[i]);
    }
    public static ArrayList<Integer> subsetSum(int nums[]) {
        // Write your code here..
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        rec(nums,0,0,arr);
        Collections.sort(arr);
        return arr;

    }

}
