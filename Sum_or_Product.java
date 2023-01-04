/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum or Product
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/sum-or-product_920478
* 
*/

public class Sum_or_Product {

	public static long sumOrProduct(int n, int q) {

		// Write your code here
        long sum=0;
        if(q==1){
            return (n*(n+1))/2;
        }
        long x=(long)Math.pow(10,9)+7;
        BigInteger a = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            a=a.multiply(BigInteger.valueOf(i));
        }
        a=a.remainder(BigInteger.valueOf(x));
        return a.longValue();
	}
}
