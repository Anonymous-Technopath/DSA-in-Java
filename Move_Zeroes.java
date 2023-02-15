/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Move Zeroes
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/move-zeroes/
* 
*/

class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            nums[l]=nums[i];
            l++;
        }
        for(int i=l;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
