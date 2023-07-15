/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Frequency in a range
*Problem Source : Coding Ninjas
* 
*/

public class Count_Frequency_In_A_Range {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int arr[]=new int[n];
        for(int i:nums){
            if(i>n){
                continue;
            }
            arr[i-1]++;
        }
        return arr;
    }
}
