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
    int t=10;
    int ans=0;
    public void solve(TreeNode root){
        if(root==null)
            return;
          sum=sum*t+root.val;
         if(root.left==null&&root.right==null)
            ans+=sum;
        solve(root.left);
        solve(root.right);
        int n=t+root.val;
        sum-=root.val;
        sum/=10;
       
    }
    public int sumNumbers(TreeNode root) {
          if(root==null)
            return 0;
         solve(root);
        return ans;
    }
}