/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse a linked list
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/
* 
*/

class Reverse_a_linked_list
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node temp=head;
        Node x=null;
        while(temp!=null){
            Node y=temp.next;
            temp.next=x;
            x=temp;
            temp=y;
        }
        return x;
    }
}
