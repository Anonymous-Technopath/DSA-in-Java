/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Two Sum
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/two-sum_839653
* 
*/

import java.util.*;

public class Two_Sum {
	static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
        ArrayList<Pair<Integer, Integer>> sol = new ArrayList<Pair<Integer, Integer>>();
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(!hs.containsKey(arr.get(i))){
                hs.put(arr.get(i),1);
            }else{
                hs.put(arr.get(i),hs.get(arr.get(i))+1);
            }
            
            if(arr.get(i)==target-arr.get(i) && hs.get(arr.get(i))==1){
                continue;
            }
            
            if(hs.containsKey(target-arr.get(i)) && hs.get(target-arr.get(i))>0){
                sol.add(new Pair(arr.get(i),target-arr.get(i)));
                hs.put(arr.get(i),hs.get(arr.get(i))-1);
                hs.put(target-arr.get(i),hs.get(target-arr.get(i))-1);
            }
        }
        if(sol.size()==0){
            sol.add(new Pair<Integer,Integer>(-1,-1));
        }
        return sol;
	}
}
