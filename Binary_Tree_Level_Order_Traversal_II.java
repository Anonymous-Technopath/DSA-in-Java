/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Binary Tree Level Order Traversal II
*Problem Source : Leet Code
*Problem Link : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
* 
*/

class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        ArrayList<TreeNode> q=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        q.add(root);
        while(q.size()!=0){
            int x=q.size();
            for(int i=0;i<x;i++){
                a.add(q.get(0).val);
                if(q.get(0).left!=null){
                    q.add(q.get(0).left);
                }
                if(q.get(0).right!=null){
                    q.add(q.get(0).right);
                }
                q.remove(0);
            }
            arr.add(a);
            a=new ArrayList<>();
        }
        List<List<Integer>> z=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            z.add(arr.get(arr.size()-1-i));
        }
        return z;
    }
}
