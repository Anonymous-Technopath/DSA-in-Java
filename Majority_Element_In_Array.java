/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Majority Element
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Majority_Element_In_Array {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        long val = v.length/3;
        Arrays.sort(v);
        HashMap<Integer,Long> hm=new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<v.length;i++){
            hm.put(v[i],hm.getOrDefault(v[i], 0L)+1);
            if(!h.contains(v[i])&& hm.get(v[i])>val){
                arr.add(v[i]);
                h.add(v[i]);
            }
        }
        return arr;
    }
}
