/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Infix To Postfix
*Problem Source : Coding Ninjas
* 
*/

import java.util.Stack;

public class Infix_To_Postfix {
    public static String infixToPostfix(String str) {
        // Write your code here
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        label: for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+'){
                if(s.isEmpty()){
                    s.push(str.charAt(i));
                }
                else{
                    while(!s.isEmpty()&&s.peek()!='('){
                        sb.append(s.pop());
                    }
                    s.push(str.charAt(i));
                }
            }else if(str.charAt(i)=='-'){
                if(s.isEmpty()){
                    s.push(str.charAt(i));
                }
                else{
                    while(!s.isEmpty()&&s.peek()!='('){
                        sb.append(s.pop());
                    }
                    s.push(str.charAt(i));
                }
            }else if(str.charAt(i)=='*'){
                if(s.isEmpty()){
                    s.push(str.charAt(i));
                }
                else{
                    
                    while(!s.isEmpty()&&s.peek()!='('){
                        if(s.peek()=='+'||s.peek()=='-'){
                            s.push(str.charAt(i));
                            continue label;
                        }
                        sb.append(s.pop());
                    }
                    s.push(str.charAt(i));
                }
            }else if(str.charAt(i)=='/'){
                if(s.isEmpty()){
                    s.push(str.charAt(i));
                }
                else{
                    
                    while(!s.isEmpty()&&s.peek()!='('){
                        if(s.peek()=='+'||s.peek()=='-'){
                            s.push(str.charAt(i));
                            continue label;
                        }
                        sb.append(s.pop());
                    }
                    s.push(str.charAt(i));
                }
            }else if(str.charAt(i)=='^'){
                if(s.isEmpty()){
                    s.push(str.charAt(i));
                }
                else{
                    
                    while(!s.isEmpty()&&s.peek()!='('){
                        if(s.peek()=='+'||s.peek()=='-'||s.peek()=='/'||s.peek()=='*'){
                            s.push(str.charAt(i));
                            continue label;
                        }
                        sb.append(s.pop());
                    }
                    s.push(str.charAt(i));
                }
            }else if(str.charAt(i)=='('){
                s.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                while(!s.isEmpty()&&s.peek()!='('){
                    sb.append(s.pop());
                }
                s.pop();
            }else{
                sb.append(str.charAt(i));
            }
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
}
