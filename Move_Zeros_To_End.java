/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Move Zero's to End
*Problem Source : Coding Ninjas
* 
*/

public class Move_Zeros_To_End {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int p=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[p]=a[i];
                p++;
            }
        }
        for(int i=p;i<n;i++){
            a[i]=0;
        }
        return a;
    }
}
