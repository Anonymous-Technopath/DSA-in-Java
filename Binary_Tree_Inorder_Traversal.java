/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Binary Tree Inorder Traversal
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/
* 
*/

class Binary_Tree_Inorder_Traversal{
    public void rec(TreeNode root,List<Integer> x){
        if(root==null){
            return;
        }
        rec(root.left,x);
        x.add(root.val);
        rec(root.right,x);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> x=new ArrayList<>();
        rec(root,x);
        return x;
    }
}
