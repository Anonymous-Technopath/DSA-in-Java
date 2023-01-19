/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Merge Sorted Array
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/merge-sorted-array/
* 
*/

class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m];
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
        int i=0,j=0,x=0;
        while(i<m &&j<n){
            if(nums3[i]<=nums2[j]){
                nums1[x]=nums3[i];
                i++;
                x++;
            }else{
                nums1[x]=nums2[j];
                j++;
                x++;
            }
        }
        if(i>=m && j<n){
            while(j<n){
                nums1[x]=nums2[j];
                j++;
                x++;
            }
        }
        else if(i<m && j>=n){
            while(i<m){
                nums1[x]=nums3[i];
                i++;
                x++;
            }
        }
    }
}
