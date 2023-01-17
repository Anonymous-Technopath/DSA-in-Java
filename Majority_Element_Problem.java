/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Majority Element Problem
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/majority-element_842495
* 
*/

import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Majority_Element_Problem {
	public static int findMajority(int[] arr, int n) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
            }
            if(hs.get(arr[i])>n/2){
                return arr[i];
            }
        }
        return -1;
	}
}
