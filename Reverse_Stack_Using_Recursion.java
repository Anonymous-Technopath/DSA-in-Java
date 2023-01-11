/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse Stack Using Recursion
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/reverse-stack-using-recursion_631875
* 
*/

import java.util.Stack;

public class Reverse_Stack_Using_Recursion {
    public static void insertAtBottom(Stack<Integer> stack,int x){
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int n=stack.peek();
        stack.pop();
        insertAtBottom(stack,x);
        stack.push(n);        
    }
    public static void rec(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int num=stack.peek();
        stack.pop();
        rec(stack);
        insertAtBottom(stack,num);
    }
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		rec(stack);
	}

}
