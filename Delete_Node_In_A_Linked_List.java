/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Delete Node In A Linked List
*Problem Source : Coding Ninjas
* 
*/

import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Delete_Node_In_A_Linked_List{
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        node.data=node.next.data;
        node.next=node.next.next;
	}
}
