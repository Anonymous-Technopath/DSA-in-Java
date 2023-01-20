/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Second Largest
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/second-largest3735/
* 
*/

class Second_Largest {
    int print2largest(int arr[], int n) {
        // code here
        int x=Integer.MIN_VALUE;
        int y=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                y=x;
                x=arr[i];
            }
            else if(arr[i]>y && arr[i]!=x){
                y=arr[i];
            }
        }
        if (y==Integer.MIN_VALUE){
            return -1;
        }
        return y;
    }
}
