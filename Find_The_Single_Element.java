/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Find The Single Element
*Problem Source : Coding Ninjas
* 
*/

public class Find_The_Single_Element {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int i=0,n=arr.length;
        for(i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[i];
    }
}
