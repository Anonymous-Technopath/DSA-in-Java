/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Maximum Depth of Binary Tree
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/
* 
*/

class Maximum_Depth_Of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
