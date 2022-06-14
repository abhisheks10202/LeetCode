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
    public String solve(TreeNode root){
        if(root==null)
            return "";
        
        if(root.left==null&&root.right==null)
        {
            return root.val+",";
            
        }
        String p=solve(root.left);
        String k=solve(root.right);
        return p+k;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String s1="";
        s1=solve(root1);
        String s2="";
        s2=solve(root2);
        // System.out.println(s1+" "+s2);
        if(s1.equals(s2))
            return true;
        else return false;
    }
}