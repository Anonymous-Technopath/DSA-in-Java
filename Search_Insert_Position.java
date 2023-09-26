/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Search Insert Position
*Problem Source : Coding Ninjas
* 
*/

public class Search_Insert_Position {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int start=0,end=arr.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==m){
                return mid;
            }else if(arr[mid]<m){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
