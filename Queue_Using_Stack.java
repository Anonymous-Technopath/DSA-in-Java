/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Queue Using Stack
*Problem Source : Coding Ninjas
* 
*/

import java.util.*;
public class Queue_Using_Stack{
    static class Queue {
        // Define the data members(if any) here.
        Stack<Integer> s1;
        Stack<Integer> s2;
        Queue() {
            // Initialize your data structure here.
            s1=new Stack<>();
            s2=new Stack<>();
        }

        void enQueue(int val) {
            // Implement the enqueue() function.
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(val);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int deQueue() {
            // Implement the dequeue() function.
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }

        int peek() {
            // Implement the peek() function here.
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }

        boolean isEmpty() {
            // Implement the isEmpty() function here.
            return s1.isEmpty();
        }
    }
}
