/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Product Of Array Except Self
*Problem Source : Coding Ninjas
* 
*/

import java.math.BigInteger;

public class Product_Of_Array_Except_Itself{

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
        BigInteger b=BigInteger.valueOf(1);
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
                continue;
            }
            b=b.multiply(BigInteger.valueOf(arr[i]));
        }
        int sol[]=new int[arr.length];
        if(zero>=2){
            return sol;
        }
        if(zero==1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0)
                sol[i]=b.mod(BigInteger.valueOf((long)(Math.pow(10,9)+7))).intValue();
            }
        }else{
            for(int i=0;i<arr.length;i++){
                sol[i]=b.divide(BigInteger.valueOf(arr[i])).mod(BigInteger.valueOf((long)(Math.pow(10,9)+7))).intValue();
            }
        }
        return sol;
    }

}
