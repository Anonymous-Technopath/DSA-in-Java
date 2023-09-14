/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Alternate Numbers
*Problem Source : Coding Ninjas
* 
*/

public class Alternate_Numbers {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int arr[] = new int[a.length];
        if(a.length==0){
            return arr;
        }
        int j=0,k=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                arr[j]=a[i];
                j+=2;
            }else{
                arr[k]=a[i];
                k+=2;
            }
        }
        return arr;
    }
}
