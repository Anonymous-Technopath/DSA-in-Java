/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Missing number in array
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/0
* 
*/

class Missing_Number {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];
        }
        sum=(n*(n+1)/2)-sum;
        return sum;
    }
}
