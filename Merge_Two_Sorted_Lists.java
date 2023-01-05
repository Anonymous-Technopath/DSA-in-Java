/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Merge Two Sorted Lists
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/merge-two-sorted-lists/
* 
*/

class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode temp=head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
            return head.next;
        }
        temp.next=list2;
        return head.next;
    }
}
