/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Merge All Overlapping Intervals
*Problem Source : Coding Ninjas
* 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merge_All_Overlapping_Intervals {
    static class Pair{
        int first,second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        List<List<Integer>> sol=new ArrayList<>();
        ArrayList<Pair> p=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            p.add(new Pair(arr[i][0],arr[i][1]));
        }
        Collections.sort(p,new Comparator<Pair>(){
            @Override
            public int compare(Pair a,Pair b){
                return b.second-a.second;
            }
        });
        int x=p.get(0).first;
        int y=p.get(0).second;
        for(Pair i:p){
            if((i.first<=y && x<=i.first)||(i.second>=x &&i.second<=y)){
                x = Math.min(x,i.first);
                y = Math.max(y,i.second);
            }else{
                ArrayList<Integer> a = new ArrayList<>();
                a.add(x);
                a.add(y);
                sol.add(a);
                x=i.first;
                y=i.second;
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        a.add(x);
        a.add(y);
        sol.add(a);
        return sol;
    }
}
