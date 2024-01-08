/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sort Stack
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 
public class Sort_Stack {
	public static void insert(Stack<Integer> s,int i){
		if(s.isEmpty()){
			s.push(i);
			return ;
		}
		if(s.peek()>i){
			int k=s.pop();
			insert(s,i);
			s.push(k);
		}else{
			s.push(i);
		}
	}
	
	public static void sort(Stack<Integer> s,int n){
		if(s.empty()){
			insert(s,n);
			return;
		}
		sort(s,s.pop());
		insert(s,n);
		
	}
	public static Stack<Integer> sortStack(Stack<Integer> s) {
		//Write your code here
		if(s.isEmpty()){
			return s;
		}
		sort(s,s.pop());
		return s;
	}
}
