/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Sum of Left Leaves
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/sum-of-left-leaves/
* 
*/

class Sum_Of_Left_Leaves {
    public int rec(TreeNode root,boolean t){
        if(root==null){
            return 0;
        }
        if(t && root.left==null && root.right==null){
            return root.val;
        }
        return rec(root.left,true)+rec(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return rec(root,false);
    }
}
