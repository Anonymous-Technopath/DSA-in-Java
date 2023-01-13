/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : K Largest Element
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/k-largest-element_1062624
* 
*/

import java.util.*;
public class K_Largest_Element {
    public static int[] Klargest(int[] a, int k, int n) {
        // Write your code here
//         int s[]=new int[k];
//         Arrays.fill(s,Integer.MIN_VALUE);
//         for(int i=0;i<n;i++){
//             if(a[i]>s[0]){
//                 int temp=a[i];
//                 for(int j=k-1;j>0;j--){
//                     if(temp==Integer.MIN_VALUE){
//                         break;
//                     }
//                     if(temp>s[j]){
//                         int temp2=s[j];
//                         s[j]=temp;
//                         temp=temp2;
//                     }
//                 }
//                 s[0]=temp;
//             }
//         }
        
        //The above solution got stuck on the last test case which was on large dataset but preserves original array
        int s[]=new int[k];
        Arrays.sort(a);
        for(int i=0;i<k;i++){
            s[k-1-i]=a[n-1-i];
        }
        return s;
    }
}
