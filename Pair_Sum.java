/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Pair Sum
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/pair-sum_697295
* 
*/

import java.util.* ;
import java.io.*;
import java.util.* ;
import java.io.*;
public class Pair_Sum{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> sol=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }else{
                hs.put(arr[i],1);
                num.add(arr[i]);
            }
        }
        for(int i=0;i<num.size();i++){
            if(num.contains(s-num.get(i))){
                int x=hs.get(num.get(i))*hs.get(s-num.get(i));
                if(num.get(i)==s-num.get(i)){
                    x=hs.get(num.get(i))*(hs.get(num.get(i))-1)/2;
                }
                hs.put(num.get(i),0);
                hs.put(s-num.get(i),0);
                for(int j=0;j<x;j++){
                    sol.add(new int[]{Math.min(num.get(i),s-num.get(i)),Math.max(num.get(i),s-num.get(i))});
                }
            }
        }
        Collections.sort(sol,new Comparator<int[]>() {
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        return sol;
    }
}
