/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Subarray With Sum K
*Problem Source : Coding Ninjas
* 
*/

public class Longest_Subarray_With_Sum_K {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int i=0,j=1;
        long sum=a[i];
        int l=-1;
        while(i<j&&j<a.length){
            if(sum==k){
                l=Math.max(l,j-i);
                sum=sum+a[j];
                j++;
                continue;
            }
            if(sum<k){
                sum+=a[j];
                j++;
            }else{
                sum=sum-a[i];
                i++;
            }
        }
        if(sum==k){
            l=Math.max(l,j-i);
        }
        return l;
    }
}
