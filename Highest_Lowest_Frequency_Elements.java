/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Highest / Lowest Frequency Elements
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Highest_Lowest_Frequency_Elements {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:v){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        hm.put(Integer.MIN_VALUE,Integer.MIN_VALUE);
        hm.put(Integer.MAX_VALUE,Integer.MAX_VALUE);
        int arr[]=new int[2];
        arr[1]=Integer.MAX_VALUE;
        arr[0]=Integer.MIN_VALUE;
        for(int i:hm.keySet()){
            if(i==Integer.MIN_VALUE ||i==Integer.MAX_VALUE){
                continue;
            }
            if(hm.get(i)<hm.get(arr[1])){
                arr[1]=i;
            }
            if(hm.get(i)==hm.get(arr[1]) && i<arr[1]){
                arr[1]=i;
            }
            if(hm.get(i)>hm.get(arr[0])){
                arr[0]=i;
            }
            if(hm.get(i)==hm.get(arr[0]) && i<arr[0]){
                arr[0]=i;
            }
        }
        return arr;
    }
}
