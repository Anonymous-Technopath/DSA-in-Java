/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Intersection Of Two Sorted Arrays
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149
* 
*/

import java.util.* ;
import java.io.*; 
public class Intersection_Of_Two_Sorted_Arrays
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
        ArrayList<Integer> arr=new ArrayList<Integer>();
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hs.containsKey(arr1.get(i))){
                hs.put(arr1.get(i),hs.get(arr1.get(i))+1);
            }else{
                hs.put(arr1.get(i),1);
            }
        }
        for(int j=0;j<m;j++){
            if(hs.containsKey(arr2.get(j)) && hs.get(arr2.get(j))>=1){
                arr.add(arr2.get(j));
                hs.put(arr2.get(j),hs.get(arr2.get(j))-1);
            }
        }
        return arr;
	}
}
