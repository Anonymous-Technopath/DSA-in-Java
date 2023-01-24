/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Search an Element in an array
*Problem Source : Geeks For Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/
* 
*/

class Search_An_Element_In_An_Array{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        for(int i=0;i<N;i++){
            if(arr[i]==X)
            return i;
        }
        return -1;
    }
    
}
