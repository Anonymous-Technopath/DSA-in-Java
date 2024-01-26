/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Of Greater Elements To The Right
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Count_Of_Greater_Elements_To_The_Right {
    public static int[] countGreater(int []arr, int []query) {
        // Write your code here.
        int sol[]=new int[arr.length];
        HashSet<Integer> hs=new HashSet<>();
        for(int i:query){
            hs.add(i);
        }
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s1.isEmpty()&&arr[s1.peek()]<arr[i]){
                int n=s1.pop();
                sol[n]++;
                s2.push(n);
            }
            if(hs.contains(i)){
                s1.push(i);
            }
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        int ans[]=new int[query.length];
        for(int i=0;i<query.length;i++){
            ans[i]=sol[query[i]];
        }
        return ans;
    }
}
