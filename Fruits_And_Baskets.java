/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Fruits and Baskets
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Fruits_And_Baskets {
    public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0,r=0;
        int max=1;
        hm.put(arr[l],l);
        while(l<=r && r<n){
            r++;
            if(r==n){
                break;
            }
            hm.put(arr[r],r);
            while(hm.size()>2){
                if(hm.get(arr[l])==l){
                    hm.remove(arr[l]);
                }
                l++;
            }
            max=Math.max(r-l+1,max);
        }
        return max;
    }
}
