/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Combination Sum
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Combination_Sum {
    public static void rec(int arr[],int i,int sum,int b,HashSet<List<Integer>> sol,List<Integer> ans){
        if(sum==b){
            sol.add(ans);
            return;
        }
        if(i==arr.length||sum>b){
            return;
        }
        List<Integer> temp= new ArrayList<>(ans);
        temp.add(arr[i]);
        rec(arr,i,sum+arr[i],b,sol,temp);
        rec(arr,i+1,sum,b,sol,ans);
    }
    public static List< List < Integer > > combSum(int []arr, int b) {
        // Write your code here.
        HashSet<List<Integer>> sol=new HashSet<>();
        Arrays.sort(arr);
        rec(arr,0,0,b,sol,new ArrayList<>());
        return new ArrayList<>(sol);
    }
}
