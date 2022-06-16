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
    List<String>list=new ArrayList<>();
    public void solve(TreeNode root,String ans){
        if(root==null)
            return;
        // String ch=root.val+"->";
        
        if(root.left==null&&root.right==null)
        {
            ans+=root.val;
            list.add(ans);
            ans=ans.substring(0,ans.length()-1);
            return;
        }
        solve(root.left,ans+root.val+"->");
        solve(root.right,ans+root.val+"->");
        // ans=ans.substring(0,ans.length()-3);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        solve(root,"");
        return list;
    }
}