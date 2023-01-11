/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove loop in Linked List
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/
* 
*/

class Remove_loop_in_Linked_List
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null || head.next==null){
            return;
        }
        Node x=new Node();
        Node pointer=x;
        Node y;
        Node prev=head;
        Node temp=head.next;
        head.next=null;
        while(temp!=null){
            if(temp==head ||temp.data==Integer.MAX_VALUE){
                prev.next=null;
                break;
            }
            y=new Node();
            y.data=temp.data;
            temp.data=Integer.MAX_VALUE;
            x.next=y;
            x=x.next;
            prev=x;
            temp=temp.next;
        }
        head.next=pointer.next;
        
    }
}
