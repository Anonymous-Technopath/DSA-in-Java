/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Linked List Cycle
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/linked-list-cycle/
* 
*/

public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        while(head!=null){
            if(head.val==Integer.MAX_VALUE){
                return true;
            }
            head.val=Integer.MAX_VALUE;
            head=head.next;
        }
        return false;
    }
}
