/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Insertion Sort
*Problem Source :Coding Ninjas
* 
*/

public class Insertion_Sort {
    public static void insertionSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
