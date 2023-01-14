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
    public static List<int[]> pairSum(int[] arr, int k) {
        ArrayList<int[]> sol=new ArrayList<int[]>();
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        ArrayList<Integer> s=new ArrayList<Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],1);
            }else{
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            if(!s.contains(arr[i]))
            s.add(arr[i]);
        }
        Collections.sort(s);
        for(int i=0;i<s.size();i++){
            int x=s.get(i);
            if(s.contains(k-x)&& x!=k-x){
                for(int j=0;j<hs.get(x)*hs.get(k-x);j++){
                    int a[]=new int[2];
                    a[0]=x;
                    a[1]=k-x;
                    sol.add(a);
                }
                s.remove(i);
                s.remove(s.indexOf(k-x));
                i--;
            }
            else if(x==k-x){
                if(hs.get(x)>1){
                    //Unique pairs=n*(n-1)/2
                    for(int j=0;j<(hs.get(x))*(hs.get(x)-1)/2;j++){
                    int a[]=new int[2];
                    a[0]=x;
                    a[1]=x;
                    sol.add(a);
                    }
                }
            }
        }
        return sol;
    }
}
