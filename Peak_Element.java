/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Peak Element
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/peak-element/
* 
*/

class Peak_Element
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n==1){
           return 0;
       }
       if(n==2){
           if(arr[0]>=arr[1]){
               return 0;
           }else{
               return 1;
           }
       }
       
       if(arr[0]>=arr[1]){
           return 0;
       }
       if(arr[n-1]>=arr[n-2]){
           return n-1;
       }
       for(int i=1;i<n-1;i++){
           if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
               return i;
           }
       }
       return -1;
    }
}
