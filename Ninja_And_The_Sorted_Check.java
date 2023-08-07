/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Ninja And The Sorted Check
*Problem Source : Coding Ninjas
* 
*/

public class Ninja_And_The_Sorted_Check {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int x=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<x){
                return 0;
            }
            x=a[i];
        }
        return 1;
    }
}
