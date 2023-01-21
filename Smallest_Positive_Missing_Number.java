/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Smallest Positive Missing Number
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/
* 
*/

class Smallest_Positive_Missing_Number
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        for(int i=0;i<size;i++){
            if(arr[i]<=0){
                arr[i]=size+1;
            }
        }
        for(int i=0;i<size;i++){
            int index=Math.abs(arr[i])-1;
            if(index<size && arr[index]>0){
                arr[index]=-arr[index];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return size+1;
        
    }
}
