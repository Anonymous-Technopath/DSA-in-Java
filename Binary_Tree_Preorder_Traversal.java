/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Binary Tree Preorder Traversal
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/binary-tree-preorder-traversal/
* 
*/

class Binary_Tree_Preorder_Traversal{
    public void rec(List<Integer> a,TreeNode root){
        if(root==null){
            return;
        }
        a.add(root.val);
        rec(a,root.left);
        rec(a,root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        rec(a,root);
        return a;
    }
}
