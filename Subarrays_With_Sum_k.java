/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subarrays with Sum ‘k'
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Subarrays_With_Sum_k{
    public static List< List < Integer > > subarraysWithSumK(int []a, long k) {
        // Write your code here
        List< List < Integer > > ans=new ArrayList<>();
        int i=0,j=0;
        long sum=0;
        ArrayList<Integer> b=new ArrayList<>();
        while(i<=j &&j<a.length){
            if(sum==k){
                ans.add((ArrayList<Integer>)b.clone());
                sum=sum-a[i];
                b.remove(0);
                i++;
            }else if(sum>k){
                sum=sum-a[i];
                b.remove(0);
                i++;
            }else{
                sum=sum+a[j];
                b.add(a[j]);
                j++;
                if(j==a.length && sum==k){
                    ans.add((ArrayList<Integer>)b.clone());
                }
            }
        }
        return ans;
    }
}
