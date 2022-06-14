/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>list=new ArrayList<>();
    public boolean solve(TreeNode root,int k)
    {
        if(root==null)
            return false;
        if(list.size()==0||list.contains(root.val)==false)
            list.add(k-root.val);
        else if(list.contains(root.val))
            return true;
        return solve(root.left,k)||solve(root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        return solve(root,k);
    }
}