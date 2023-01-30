/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Print first n Fibonacci Numbers
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/
* 
*/

class Print_First_N_Fibonacci_Numbers
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long z[]=new long[n];
        long a=0,b=1;
        for(int i=0;i<n;i++){
            z[i]=b;
            long x=a+b;
            a=b;
            b=x;
        }
        return z;
    }
}
