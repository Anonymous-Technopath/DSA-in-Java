/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Remove Duplicates from Sorted List
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
* 
*/

class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val==prev.val){
                prev.next=temp.next;
                temp=temp.next;
                continue;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
