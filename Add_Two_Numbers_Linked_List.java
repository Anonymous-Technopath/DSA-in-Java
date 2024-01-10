/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Add Two Numbers
*Problem Source : Coding Ninjas
* 
*/

import java.util.* ;
import java.io.*; 

public class Add_Two_Numbers_Linked_List {
    static void addition(LinkedListNode sum,LinkedListNode head1,LinkedListNode head2){
        int carry=0;
        if(head1==null && head2==null){
            sum.next=null;
            return;
        }
        while(head1!=null &&head2!=null)
        {
            sum.next=new LinkedListNode(head1.data+head2.data+carry);
            sum=sum.next;
            carry=sum.data/10;
            sum.data=sum.data%10;
            head1=head1.next;
            head2=head2.next;
        }
        if(head1==null && head2==null){
            if(carry==1){
                sum.next=new LinkedListNode(1);
            }
            return;
        }
        if(head1==null){
            while(head2!=null)
            {
                sum.next=new LinkedListNode(head2.data+carry);
                sum=sum.next;
                carry=sum.data/10;
                sum.data=sum.data%10;
                head2=head2.next;
            }
        }
        else{
            while(head1!=null)
            {
                sum.next=new LinkedListNode(head1.data+carry);
                sum=sum.next;
                carry=sum.data/10;
                sum.data=sum.data%10;
                head1=head1.next;
            }
        }

        if(carry==1){
            sum.next=new LinkedListNode(1);
        }

    }
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.

        LinkedListNode sum=new LinkedListNode(0);
        addition(sum,head1,head2);
        return sum.next;
    }
}
