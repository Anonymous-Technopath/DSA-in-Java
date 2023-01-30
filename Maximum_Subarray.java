/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum Subarray
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/maximum-subarray/
* 
*/

class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int curSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            maxSum=Math.max(Math.max(maxSum,nums[i]),curSum);
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}
