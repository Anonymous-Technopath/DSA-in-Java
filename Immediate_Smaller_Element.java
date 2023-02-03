/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Immediate Smaller Element
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/
* 
*/

class Immediate_Smaller_Element {
    void immediateSmaller(int arr[], int n) {
        // code here
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                arr[i]=arr[i+1];
            }else{
                arr[i]=-1;
            }
        }
        arr[n-1]=-1;
    }
}
