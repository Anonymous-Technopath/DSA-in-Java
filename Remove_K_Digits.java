/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove K Digits
*Problem Source : Coding Ninjas
* 
*/

import java.util.Stack;

public class Remove_K_Digits {
    public static String removeKDigits(String num, int k) {
        // Write your code here.
        if(k==num.length()){
            return "0";
        }
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!s.isEmpty()&& s.peek()>num.charAt(i)&&k>0){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        } 
        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty()){
            sb.append(s.pop());
            
        }
        sb=sb.reverse();
        while(sb.length()!=0){
            if(sb.charAt(0)=='0'){
                sb.delete(0, 1);
            }else{
                break;
            }
        }
        if(sb.length()==0){
            return "0";
        }

        return sb.toString();
    }
}
