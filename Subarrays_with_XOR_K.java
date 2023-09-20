/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Subarrays with XOR ‘K’
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Subarrays_with_XOR_K {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int xor=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
            if(hm.containsKey(xor^b)){
                count+=hm.get(xor^b);
            }
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
