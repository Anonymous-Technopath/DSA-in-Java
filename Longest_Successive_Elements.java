/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Longest Successive Elements
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Longest_Successive_Elements{
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        HashMap<Integer,Boolean> hm=new HashMap<>();
        HashSet<Integer> h=new HashSet<>();
        for(int i:a){
            h.add(i);
        }
        for(int i:a){
            if(h.contains(i-1)){
                hm.put(i,true);
            }else{
                hm.put(i,false);
            }
        }
        int max=0;
        for(int i:h){
            if(hm.getOrDefault(i+1,false)==true){
                continue;
            }
            int count=0,x=i;
            while(hm.get(x)==true){
                count++;
                x--;
            }
            max=Math.max(count+1,max);
        }
        return max;
    }
}
