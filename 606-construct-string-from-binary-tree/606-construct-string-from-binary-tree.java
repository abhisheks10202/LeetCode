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
    // List<String>list=new ArrayList<>();
    String ans="";
    public void solve(TreeNode root){
        if(root==null)
        {  
            return ;
        }
          
        if(root.left==null&&root.right==null)
        {
            ans+=root.val;
            return;
        }
        
        ans+=root.val+"(";
        solve(root.left);
        ans+=")";
        
        if(root.right!=null){
            ans+="(";
        solve(root.right);
         ans+=")";
        }
       
        
    }
    public String tree2str(TreeNode root) {
       
        solve(root);
        // System.out.println(ans);
        // return list.get();
        return ans;
    }
}
