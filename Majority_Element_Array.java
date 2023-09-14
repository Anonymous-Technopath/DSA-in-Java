/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Majority Element
*Problem Source : Coding Ninjas
* 
*/
import java.util.*;
public class Majority_Element {
    public static int majorityElement(int []v) {
        // Write your code here
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<v.length;i++){
            h.put(v[i],h.getOrDefault(v[i], 0)+1);
            if(h.get(v[i])>v.length/2){
                return v[i];
            }
        }
        return -1;
    }
}
