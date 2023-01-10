/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Duplicates from Sorted Array II
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
* 
*/

class Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int x=Integer.MAX_VALUE;
        int index=0;
        int count=1;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(x==nums[i]){
                count++;
            }else{
                count=0;
                x=nums[i];
            }
            if(count<=2)
            {
                nums[index]=x;
                index++;
                count++;
                count2++;
            }
        }
        return count2;
    }
}
