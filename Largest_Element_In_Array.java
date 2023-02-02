/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Largest Element In Array
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/
* 
*/

class Largest_Element_In_Array{
    
    public int largest(int arr[], int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
}
