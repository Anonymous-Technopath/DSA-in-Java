/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Generate all parenthesis
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Generate_All_Parenthesis {
    public static void generate(int open,int close,String s,ArrayList<String> ans){
        if(close<=0){
            ans.add(s);
        }
        if(open>0){
            generate(open-1,close,s+"(",ans);
        }
        if(open<close){
            generate(open,close-1,s+")",ans);
        }
    }
    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        ArrayList<String> ans=new ArrayList<>();
        generate(n, n, "", ans);
        return ans;
    } 
}
