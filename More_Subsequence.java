/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : More subsequence
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class More_Subsequence {
    public static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
        HashSet<Character> s1=new HashSet<>();
        HashSet<Character> s2=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(a.charAt(i));        
        }       
        for(int i=0;i<m;i++){
            s2.add(b.charAt(i));
        }
        if(s1.size()>s2.size()){
            return a;
        }else if(s1.size()<s2.size()){
            return b;
        }
        else if(n>m){
            return a;
        }else if(m>n){
            return b;
        }
        return a;

    }
}
