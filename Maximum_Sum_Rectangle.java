/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum Sum Rectangle
*Problem Source : Coding Ninjas
* 
*/

public class Maximum_Sum_Rectangle
{

    public static int kadane(int[] arr,int n){
        int cur=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cur+=arr[i];
            max=Math.max(cur,max);
            
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
    public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
           int a[] = new int[m];
           for(int j=i; j<n; j++){
               for(int col=0; col<m; col++){
                   a[col] += arr[j][col];
               }
               max =Math.max(max, kadane(a,m));
           }
       }
       return max;
    }
}
