/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Letter Phone
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Letter_Phone {
    public static HashMap<Character,char[]> hm=new HashMap<>();
    public static void init(){
        hm.put('2',new char[]{'a','b','c'});
        hm.put('3',new char[]{'d','e','f'});
        hm.put('4',new char[]{'g','h','i'});
        hm.put('5',new char[]{'j','k','l'});
        hm.put('6',new char[]{'m','n','o'});
        hm.put('7',new char[]{'p','q','r','s'});
        hm.put('8',new char[]{'t','u','v'});
        hm.put('9',new char[]{'w','x','y','z'});
    } 
    public static void rec(String a,int i,StringBuilder sb,List<String> ans){
        if(i==a.length()){
            ans.add(sb.toString());
            return;
        }
        for(char c:hm.getOrDefault(a.charAt(i),new char[]{a.charAt(i)})){
            rec(a,i+1,new StringBuilder(sb.toString()+c),ans);
        }
    }
    public static List<String> letterCombinations(String a) {
        // Write your code here.
        init();
        List<String> ans=new ArrayList<>();
        rec(a,0,new StringBuilder(""),ans);
        return ans;
    }
}
