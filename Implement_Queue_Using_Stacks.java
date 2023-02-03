/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Implement Queue using Stacks
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/implement-queue-using-stacks/
* 
*/

class Implement_Queue_Using_Stacks{
    Stack<Integer>  s;
    public MyQueue() {
        s=new Stack<Integer>(); 
    }
    
    public void push(int x) {
        Stack<Integer> y=new Stack<Integer>();
        while(!s.isEmpty()){
            y.push(s.peek());
            s.pop();
        }        
        s.push(x);
        while(!y.isEmpty()){
            s.push(y.peek());
            y.pop();
        }
    }
    
    public int pop() {
        int z=s.peek();
        s.pop();
        return z;
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}
