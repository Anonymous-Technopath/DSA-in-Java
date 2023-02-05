/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum Meetings
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/maximum-meetings_1062658
* 
*/

import java.util.* ;
import java.io.*; 

class Meeting{
    int start;
    int end;
    int pos;
    Meeting(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class Sorted implements Comparator<Meeting>{
    public int compare(Meeting a, Meeting b){
        return a.end - b.end;
    }
}
public class Maximum_Meetings {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<Meeting> ls = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            ls.add(new Meeting(start[i],end[i],i+1));
        }
        Collections.sort(ls,new Sorted());
        ans.add(ls.get(0).pos);
        int limit = ls.get(0).end;
        for(int i=1;i<ls.size();i++){
            if(ls.get(i).start > limit){
                ans.add(ls.get(i).pos);
                limit = ls.get(i).end;
            }
        }
        return ans;
    }
}
