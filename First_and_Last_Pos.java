/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find first and last position of element in sorted array.
*Problem Source : LeetCode
*Problem Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
* 
*/

class First_and_Last_Pos {
    public int[] searchRange(int[] nums, int target) {
        int start=Arrays.binarySearch(nums,target);
        int end=start;
        int sol[] =new int[2];
        if(start<0){
            sol[0]=-1;
            sol[1]=-1;
            return sol;
        }
        for(int i=end;i<nums.length;i++){
            if(nums[i]==target){
                end=i;
            }
            else{
                break;
            }
        }
        for(int i=start;i>=0;i--){
            if(nums[i]==target){
                start=i;
            }
            else{
                break;
            }
        }
        sol[0]=start;
        sol[1]=end;
        return sol;
    }
}
