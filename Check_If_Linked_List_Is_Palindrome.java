/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Check if Linked List is Palindrome
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/
* 
*/

class Check_If_Linked_List_Is_Palindrome
{
    //Function to check whether the list is palindrome.
    Node reverse(Node head){
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
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null||head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.data!=slow.data){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
}    
    
}
