/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Combination Sum II
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;

public class Combination_Sum_II
{
    public static void rec(ArrayList<Integer> arr,int i,int sum,int k,ArrayList<Integer> result,HashSet<ArrayList<Integer>> hs){
        if(i==arr.size()||sum>=k){
            return;
        }
        rec(arr,i+1,sum,k,result,hs);
        ArrayList<Integer> temp=(ArrayList)result.clone();
        temp.add(arr.get(i));
        if(sum+arr.get(i)==k){
            hs.add(temp);
        }
        rec(arr,i+1,sum+arr.get(i),k,temp,hs);
        
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int k)
    {
        //    Write your code here.
        if(k==0){
            ArrayList<Integer> temp=new ArrayList<>();
            ArrayList<ArrayList<Integer>> sol=new ArrayList<>();
            sol.add(temp);
            return sol;
        }
        HashSet<ArrayList<Integer>> hs=new HashSet<>();
        Collections.sort(arr);
        rec(arr,0,0,k,new ArrayList<>(),hs);
        ArrayList<ArrayList<Integer>> sol= new ArrayList<>(hs);
        Collections.sort(sol,new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
                int min=Math.min(a.size(),b.size());
                for(int i=0;i<min;i++){
                    int x=a.get(i)-b.get(i);
                    if(x!=0){
                        return x;
                    }
                }
                return a.size()-b.size();
            }
        });
        return sol;
    }
}
