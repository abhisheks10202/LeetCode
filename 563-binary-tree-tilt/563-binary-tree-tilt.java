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
    public int solve(TreeNode root){
    if(root==null)
        return 0;
        int val1=solve(root.left);
        int val2=solve(root.right);
        sum+=Math.abs(val1-val2);
        return val1+val2+root.val;
        
}
    public int findTilt(TreeNode root) {
        solve(root);
        return sum;
        
    }
}