/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sort a Stack
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275
* 
*/

import java.util.* ;
import java.io.*; 
public class Sort_a_Stack {
    public static void sort(Stack<Integer> stack,int x){
        if(stack.isEmpty() ||stack.peek()<x){
            stack.push(x);
            return;
        }
        int num=stack.peek();
        stack.pop();
        
        sort(stack,x);
        stack.push(num);
    }
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        if(stack.isEmpty()){
            return;
        }
        int num=stack.peek();
        stack.pop();
        
        sortStack(stack);
        sort(stack,num);
	}

}
