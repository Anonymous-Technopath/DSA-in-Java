/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximize sum(arr[i]*i) of an Array
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/
* 
*/

class Maximize_Sum_arr_i_X_i_Of_An_Array{
    
     int Maximize(int arr[], int n)

    {

        // Complete the function

       Arrays.sort(arr);

       long sum =0;

       for(int i=0;i<n;i++){

           sum = sum + (long)arr[i]*i;

       }

        

        return (int)((long)sum % (java.lang.Math.pow(10,9)+7));

        

    }   

}
