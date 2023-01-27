/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Duplicate Elements From Sorted Array
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/
* 
*/

class Remove_Duplicate_Elements_From_Sorted_Array{
    int remove_duplicate(int A[],int N){
        // code here
        int i=0,j=0,count=N;
        if(N==1){
            return 1;
        }
        while(j<N){
            if(i==j){
                j++;
                continue;
            }
            if(A[i]==A[j]){
                j++;
                count--;
                continue;
            }
            i++;
            A[i]=A[j];
            j++;
        }
        return count;
    }
}
