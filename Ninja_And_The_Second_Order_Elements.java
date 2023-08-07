/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Ninja And The Second Order Elements
*Problem Source : Coding Ninjas
* 
*/

public class Ninja_And_The_Second_Order_Elements {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,max1=-1,max2=-1;
        for(int i=0;i<n;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            if(a[i]>max2 && a[i]!=max1){
                max2=a[i];
            }
            if(min1>a[i]){
                min2=min1;
                min1=a[i];
            }
            if(a[i]<min2 && a[i]!=min1){
                min2=a[i];
            }
        }
        if(min2==Integer.MAX_VALUE){
            min2=-1;
        }
        int b[]=new int[2];
        b[0]=max2;
        b[1]=min2;
        return b;
    }
}
