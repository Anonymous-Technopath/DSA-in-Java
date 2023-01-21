/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Partition List
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/partition-list/
* 
*/

class Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode y=new ListNode();
        ListNode head1=y;
        ListNode z=new ListNode();
        ListNode head2=z;
        if(head==null || head.next==null){
            return head;
        }
        
        while(temp!=null){
            if(temp.val<x){
                y.next=temp;
                y=y.next;
            }else{
                z.next=temp;
                z=z.next;
            }
            temp=temp.next;
        }
        y.next=head2.next;
        z.next=null;
        return head1.next;
    }
}
