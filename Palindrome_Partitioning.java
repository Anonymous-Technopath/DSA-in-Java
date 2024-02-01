/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Palindrome Partitioning
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Palindrome_Partitioning {
    public static boolean pal(String a){
        return a.equals((new StringBuffer(a)).reverse().toString());
    }
    public static void rec(String a,List<List<String>> sol, List<String> ans){
        if(a.equals("")){
            sol.add(new ArrayList<>(ans));
            return;
        }
        StringBuilder s=new StringBuilder("");
        int x=a.length();
        for(int i=0;i<x;i++){
            s.append(a.charAt(i));
            if(pal(s.toString())){
                int n=ans.size();
                ans.add(s.toString());
                String y=a.substring(i+1,x);
                rec(y,sol,ans);
                ans.remove(n);
            }
        }
    }
    public static List<List<String>> partition(String str) {
        // Write your code here.
        List<List<String>> sol=new ArrayList<>();
        rec(str,sol,new ArrayList<>());
        return sol;
    }
}
