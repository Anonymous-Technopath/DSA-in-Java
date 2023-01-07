/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Equilibrium Point
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/
* 
*/

class Equilibrium_Point {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
        return 1;
        long a1[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            a1[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>0;i--){
            sum+=arr[i];
            if(sum==a1[i])
            return i+1;
        }
        return -1;
        
    }
}
