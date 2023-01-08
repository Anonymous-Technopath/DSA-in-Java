/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : N-th Fibonacci Number
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/nth-fibonacci-number_1115780
* 
*/

import java.util.* ; 
import java.io.*;  
public class N_th_Fibonacci_Number{
    public static long[][] mul(long [][]a,long [][]b){
        long [][]c=new long[2][2];
        long mod=(long)(1e9+7);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    c[i][j]=(c[i][j]+(a[i][k]%mod*b[k][j]%mod))%mod;
                }
            }
        }
        return c;
    }
    public static long[][] matrixexp(long [][]d,long n){
        if(n==0)
            return new long[][]{{1,0},{0,1}};
        //int ans[][];
        long [][]res=matrixexp(d,n/2);
        if(n%2==0){
            res=mul(res,res);
        }
        else{
            res=mul(res,res);
            res=mul(res,d);
        }

       return res;
    }
    public static int fibonacciNumber(int n){
        long dp[][]={{1,1},{1,0}};
        long ans[][]=matrixexp(dp,(long)n-1);
        return (int)(ans[0][0]);
    }
}
