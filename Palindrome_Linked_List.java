/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Palindrome Linked List
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/palindrome-linked-list/
* 
*/

class Palindrome_Linked_List{
    public ListNode rev(ListNode head){
        ListNode temp=null;
        while(head!=null){
            ListNode x=head.next;
            head.next=temp;
            temp=head;
            head=x;
        }
        return temp;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode x=head;
        ListNode y=head;
        if(head==null || head.next==null){
            return true;
        }
        while(y.next!=null && y.next.next!=null){
            x=x.next;
            y=y.next.next;
        }
        x.next=rev(x.next);
        x=x.next;
        while(x!=null){
            if(head.val!=x.val){
                return false;
            }
            head=head.next;
            x=x.next;
        }
        return true;
    }
}
