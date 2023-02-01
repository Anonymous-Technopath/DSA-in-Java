/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Print All Nodes That Don't Have Sibling
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/
* 
*/

class Print_All_Nodes_That_Dont_Have_Sibling
{
    void rec(Node root,ArrayList<Integer> a){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right!=null){
            a.add(root.right.data);
        }
        if(root.left!=null && root.right==null){
            a.add(root.left.data);
        }
        rec(root.left,a);
        rec(root.right,a);
    }
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        rec(node,a);
        if(a.size()==0){
            a.add(-1);
        }
        Collections.sort(a);
        return a;
    }
}
