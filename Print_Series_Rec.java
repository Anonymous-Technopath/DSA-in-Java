/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Print Series
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Print_Series_Rec {
    public static void rec(int n, int k,List<Integer> l){
        if(n<=0){
            l.add(n);
            return;
        }
        l.add(n);
        rec(n-k,k,l);
        l.add(n);
    }
    public static List<Integer> printSeries(int n, int k) {
        // Write your code here
        List<Integer> l =new ArrayList<>();
        rec(n,k,l);
        return l;
    }
}
