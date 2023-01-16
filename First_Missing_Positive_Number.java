/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : First Missing Positive
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/first-missing-positive/
* 
*/

class First_Missing_Positive_Number {
    public int firstMissingPositive(int[] nums) {
        int x[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=nums.length && nums[i]>0){
                x[nums[i]-1]=1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(x[i]==0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
