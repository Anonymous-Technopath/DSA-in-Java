/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Middle Of Linked List
*Problem Source : Coding Ninja
*Problem Link : https://www.codingninjas.com/codestudio/problems/middle-of-linked-list_973250
* 
*/

public class Middle_Of_Linked_List {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        if(head==null ||head.next==null){
            return head;
        }
        Node s=head;
        Node x=head;
        while(x.next!=null && x.next.next!=null){
            s=s.next;
            x=x.next.next;
        }
        if(x.next==null){
            return s;
        }
        return s.next;
    }
}
