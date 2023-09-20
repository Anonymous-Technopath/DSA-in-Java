/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Subarray With Zero Sum
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;

public class Longest_Subarray_With_Zero_Sum {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Long,Integer> hm=new HashMap<>();
        long sum=0L;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                max=Math.max(max,i-hm.get(sum));
            }else{
                hm.put(sum,i);
            }
        }
        return max;
    }
}
