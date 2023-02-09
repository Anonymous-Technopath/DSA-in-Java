/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Add 1 To A Number Represented As Linked List
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/
* 
*/

class Add_1_To_A_Number_Represented_As_Linked_List
{
    public static int rec(Node head){
        if(head.next==null){
            head.data+=1;
            int x=head.data/10;
            head.data=head.data%10;
            return x;
        }
        int x=rec(head.next);
        if(x==0){
            return 0;
        }
        head.data+=1;
        x=head.data/10;
        head.data=head.data%10;
        return x;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        if(head==null){
            Node z=new Node(1);
            return z;
        }
        if(head.next==null){
            head.data+=1;
            int x=head.data/10;
            head.data=head.data%10;
            if(x==1){
                Node z=new Node(1);
                z.next=head;
                return z;
            }
            return head;
        }
        if(rec(head)==1){
            Node z=new Node(1);
            z.next=head;
            return z;
        }
        return head;
    }
}
