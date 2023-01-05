/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Product Of Array Except Self
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/product-of-array-except-self_630271
* 
*/


import java.math.BigInteger;
public class Product_Of_Array_Except_Self{

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
        int count=0;
        BigInteger b=BigInteger.valueOf((int)Math.pow(10,9)+7);
        BigInteger a=BigInteger.valueOf(1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            a=a.multiply(BigInteger.valueOf(arr[i]));
            else{
                count++;
            }
        }
        int sol[]=new int[arr.length];
        if(count==1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    sol[i]=0;
                }else{
                    sol[i]=a.remainder(b).intValue();
                }
            }
            return sol;
        }
        if(count>=2){
            for(int i=0;i<arr.length;i++){
                sol[i]=0;
            }
            return sol;
        }
        for(int i=0;i<arr.length;i++){sol[i]=a.divide(BigInteger.valueOf(arr[i])).remainder(b).intValue();
        }
        return sol;
    }

}
