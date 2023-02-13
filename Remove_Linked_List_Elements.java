/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Linked List Elements
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/remove-linked-list-elements/
* 
*/

class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head!=null && head.val==val){
            head=head.next;
        }
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
            }else{
                prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}
