/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Binary Search
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/binary-search-1587115620/
* 
*/

class Binary_Search {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                start=mid+1;
                mid=(start+end)/2;
            }
            else{
                end=mid-1;
                mid=(start+end)/2;
            }
        }
        return -1;
    }
}
