/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Detect Loop in Linked List
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&sortBy=submissions
* 
*/

class Solution {
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
