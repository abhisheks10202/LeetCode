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
    public void solve(TreeNode root){
        if(root==null)
            return ;
        solve(root.left);
        solve(root.right);
        set.add(root.val);
       
    }
    Set<Integer>set=new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        
        solve(root);
         if(set.size()>1)
            return false;
        else return true;
        
    }
}