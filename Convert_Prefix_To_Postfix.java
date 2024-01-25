/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Convert Prefix to Postfix
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Convert_Prefix_To_Postfix {
    public static String preToPost(String str) {
        // Write Your Code Here
        Stack<String> s=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            if(s.isEmpty()){
                s.push(""+str.charAt(i));
                continue;
            }
            if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='^'){
                s.push(s.pop()+s.pop()+str.charAt(i));
            }else{
                s.push(""+str.charAt(i));
            }
        }
        return s.pop();
    }
}
