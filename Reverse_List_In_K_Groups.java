/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Reverse List In K Groups
*Problem Source : Coding Ninjas
* 
*/


public class Reverse_List_In_K_Groups{

    public static Node kReverse(Node head, int k) {

        // Write your code here.

 

        if(head == null || head.next == null)

        {

            return head;

        }

 

        Node curr = head;

        int n = 0;

 

        while(curr != null && n != k)

        {

            curr = curr.next;

            n++;

        }

 

        if(n == k)

        {

            curr = kReverse(curr, k);

            while(n-- > 0)

            {

                Node temp = head.next;

                head.next = curr;

                curr = head;

                head = temp;

            }

 

            head = curr;

        }

 

        return head;

    }

}
