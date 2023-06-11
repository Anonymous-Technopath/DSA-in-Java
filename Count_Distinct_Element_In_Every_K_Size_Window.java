/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Count Distinct Element in Every K Size Window
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Count_Distinct_Element_In_Every_K_Size_Window {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here 
		HashMap<Integer,Integer> h=new HashMap<>();
		ArrayList<Integer> sol=new ArrayList<>();
		if(arr.size()<k){
			return sol;
		}
		for(int i=0;i<k;i++){
			h.put(arr.get(i),h.getOrDefault(arr.get(i), 0)+1);
		}
		sol.add(h.size());
		for(int i=k;i<arr.size();i++){
			if(h.get(arr.get(i-k))==1){
				h.remove(arr.get(i-k));
			}else{
				h.put(arr.get(i-k),h.get(arr.get(i-k))-1);
			}
			h.put(arr.get(i),h.getOrDefault(arr.get(i), 0)+1);
			sol.add(h.size());
		}
		return sol;
	}
}
