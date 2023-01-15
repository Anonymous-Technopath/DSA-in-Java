/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Search in Rotated Sorted Array
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array/
* 
*/

class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        int pivot=0;
        if(nums.length<=5){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                }
            }
            return -1;
        }
        while(start<=end){
            if(mid<=0){
                pivot=0;
                break;
            }
            if((mid==nums.length-1 || nums[mid]<nums[mid+1]) && nums[mid]<nums[mid-1]){
                pivot=mid;
                break;
            }else if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        if(target<=nums[nums.length-1]){
            start=pivot;
            end=nums.length-1;
            mid=(start+end)/2;
            while(start<=end){
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
                mid=(start+end)/2;
            }
        }else{
            start=0;
            end=pivot;
            mid=(start+end)/2;
            while(start<=end){
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
                mid=(start+end)/2;
            }
        }
        return -1;
        
    }
}
