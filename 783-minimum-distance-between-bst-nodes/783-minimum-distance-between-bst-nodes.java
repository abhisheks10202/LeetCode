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
     int min=1000000;
    int prev=1000000;
    public void solve(TreeNode root){
        if(root==null)
            return;
       
        solve(root.left);
        min=Math.min(min,Math.abs(prev-root.val) );
        prev=root.val;
        solve(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        solve(root);
        return min;
    }
}