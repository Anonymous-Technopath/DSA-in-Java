/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Binary Tree Postorder Traversal
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/binary-tree-postorder-traversal/
* 
*/

class Binary_Tree_Postorder_Traversal {
    public void rec(List<Integer> a,TreeNode root){
        if(root==null)
        return;
        rec(a,root.left);
        rec(a,root.right);
        a.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        rec(a,root);
        return a;
    }
}
