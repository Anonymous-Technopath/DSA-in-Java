/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Merge Two Sorted Linked Lists
*Problem Source : Coding Ninjas
*Problem Link : https://www.codingninjas.com/codestudio/problems/moderate_6581710
* 
*/

public class Merge_Two_Sorted_Linked_Lists {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> head=new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> temp=head;
        while(first!=null && second!=null){
            if(first.data<=second.data){
                temp.next=new LinkedListNode<Integer>(first.data);
                first=first.next;
            }else{
                temp.next=new LinkedListNode<Integer>(second.data);
                second=second.next;
            }
            temp=temp.next;
        }
        if(first==null && second!=null){
            temp.next=second;
        }
        else if(first!=null && second==null){
            temp.next=first;
        }else{
            temp.next=null;
        }
        return head.next;
	}
}
