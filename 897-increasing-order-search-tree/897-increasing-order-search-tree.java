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
    TreeNode ans=new TreeNode();
    TreeNode dummy=ans;
    public void solve(TreeNode root){
        if(root==null)
            return;
        solve(root.left);
        dummy.right=new TreeNode(root.val);
        dummy=dummy.right;
       solve(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        
        solve(root);
        return ans.right;
    }
}


 