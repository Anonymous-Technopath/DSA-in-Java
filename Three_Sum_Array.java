/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Three Sum
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Three_Sum_Array {
    public static List< List < Integer > > triplet(int n, int []arr) {
        // Write your code here.
        List<List<Integer>> sol=new ArrayList<>();
        HashSet<List<Integer>> h=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int l=i+1;
            int r=n-1;
            int sum = arr[i]+arr[l]+arr[r]; 
            while(l<r && r<=n-1){
                if(sum==0){
                    ArrayList<Integer> a=new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[l]);
                    a.add(arr[r]);
                    if(!h.contains(a)){
                        sol.add(a);
                        h.add(a);
                    }
                    sum-=arr[l];
                    l++;
                    sum+=arr[l];
                }else if(sum<0){
                    sum-=arr[l];
                    l++;
                    sum+=arr[l];
                }
                else{
                    sum-=arr[r];
                    r--;
                    if(r!=l){
                        sum+=arr[r];
                    }
                }
            }
        }
        return sol;
    }
}
