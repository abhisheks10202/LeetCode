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
    int sum=0;
    public void solve(TreeNode root){
        if(root==null)
            return;
        solve(root.right);
        root.val+=sum;
        sum=root.val;
            solve(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        solve(root);
        return root;
    }
}