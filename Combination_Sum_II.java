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
    public static void rec(ArrayList<Integer> arr,int j, int k,ArrayList<ArrayList<Integer>> sol,ArrayList<Integer> ans){
        if(k==0){
            sol.add(new ArrayList<>(ans));
            return;
        }
        for(int i=j;i<arr.size();i++){
            if(i!=j && arr.get(i)==arr.get(i-1)){
                continue;
            }
            if(arr.get(i)>k){
                break;
            }
            ans.add(arr.get(i));
            rec(arr,i+1,k-arr.get(i),sol,ans);
            ans.remove(ans.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int k)
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> sol=new ArrayList<>();
        Collections.sort(arr);
        rec(arr,0,k,sol,new ArrayList<>());
        return sol;

    }
}
