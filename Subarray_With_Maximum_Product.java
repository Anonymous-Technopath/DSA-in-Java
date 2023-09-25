/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subarray With Maximum Product
*Problem Source : Coding Ninjas
* 
*/

public class Subarray_With_Maximum_Product {
    public static int subarrayWithMaxProduct(int []arr){
        // Write your code here.
        int max1=1;
        int max2=1;
        int max=1;
        for(int i:arr){
            max1*=i;
            max2*=i;
            if(max1<=0){
                max1=1;
            }
            if(max2==0){
                max2=1;
            }
            max=Math.max(Math.max(max,max1),max2);
        }
        return max;
    }
}
