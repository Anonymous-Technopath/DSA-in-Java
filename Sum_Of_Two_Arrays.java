/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum Of Two Arrays
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/sum-of-two-arrays_893186
* 
*/

import java.util.* ;
import java.io.*; 
import java.math.BigInteger;
public class Sum_Of_Two_Arrays {
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		// Write your code here.
        String s1="";
        String s2="";
        for(int i=0;i<n;i++){
            s1=s1+a[i];
        }
        for(int i=0;i<m;i++){
            s2=s2+b[i];
        }
        BigInteger x=new BigInteger(s1);
        x=x.add(new BigInteger(s2));
        s1=x.toString();
        a=new int[s1.length()];
        for(int i=0;i<s1.length();i++){
            a[i]=(int)(s1.charAt(i)-48);
        }
        return a;
	}
}
