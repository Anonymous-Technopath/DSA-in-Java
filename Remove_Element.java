/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Element
*Problem Source : LeetCode
*Problem Link : https://leetcode.com/problems/remove-element/
* 
*/

class Remove_Element {
    public void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public int removeElement(int[] nums, int val) {
        int step=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                step++;
            }
            else if(step>0){
                swap(nums,i-step,i);
            }
        }
        return nums.length-step;
    }
}
