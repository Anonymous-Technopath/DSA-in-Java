/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Delete without head pointer
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/
* 
*/

class Delete_Without_Head_Pointer
{
    void deleteNode(Node del)
    {
         // Your code here
         del.data=del.next.data;
         del.next=del.next.next;
    }
}
