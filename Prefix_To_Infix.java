/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Prefix to Infix
*Problem Source : Coding Ninjas
* 
*/

import java.util.Stack;

public class Prefix_To_Infix {
    public static String prefixToInfixConversion(String str) {
        // Write your code here
        StringBuffer sb=new StringBuffer(str);
        str=sb.reverse().toString();
        Stack<String> s=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='^'){
                s.push("("+s.pop()+str.charAt(i)+s.pop()+")");
            }else{
                s.push(""+str.charAt(i));
            }
        }
        return s.pop();
    }
}
