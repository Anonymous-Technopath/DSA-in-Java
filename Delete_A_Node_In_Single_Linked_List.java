/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Delete a Node in Single Linked List
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/
* 
*/

class Delete_A_Node_In_Single_Linked_List
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	if(head==null){
	    return null;
	}
	if(x==1){
	    return head.next;
	}
	Node temp=head.next;
	Node prev=head;
	int i=2;
	while(temp!=null){
	    if(i==x){
	        prev.next=temp.next;
	        break;
	    }
	    i++;
	    temp=temp.next;
	    prev=prev.next;
	}
	return head;
    }
}
