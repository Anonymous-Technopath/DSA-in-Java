/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Intersection of Two Linked Lists
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/intersection-of-two-linked-lists/
* 
*/

public class Intersection_Of_Two_Linked_Lists{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> arr=new ArrayList<ListNode>();
        while(headA!=null){
            arr.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(arr.contains(headB))
            return headB;
            headB=headB.next;
        }
        return null;
    }
}
