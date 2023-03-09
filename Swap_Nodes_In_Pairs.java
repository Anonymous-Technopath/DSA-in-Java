/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Swap Nodes in Pairs
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/swap-nodes-in-pairs/
* 
*/

class Swap_Nodes_In_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode sol =new ListNode();
        ListNode x = sol;
        ListNode temp =head;
        while(temp!=null){
            ListNode z=temp.next;
            if(z==null){
                x.next=temp;
                x=x.next;
                break;
            }
            ListNode y=z.next;
            z.next = temp;
            x.next=z;
            x=x.next.next;
            temp=y;
        }
        x.next=null;
        return sol.next;
    }
}
