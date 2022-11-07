/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Detect Loop in Linked List
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&sortBy=submissions
* 
*/

import java.util.*;
class Detect_Loop_in_Linked_List {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        Node temp=head;
        ArrayList<Node> arr=new ArrayList<Node>();
        arr.add(head);
        while(temp.next!=null){
            if(arr.contains(temp.next))
            return true;
            arr.add(temp.next);
            temp=temp.next;
        }
        return false;
        
    }
}