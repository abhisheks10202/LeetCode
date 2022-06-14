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
    TreeNode temp;
  public boolean ise(TreeNode root1,TreeNode root2){
      if(root2==null&&root1==null)
          return true;
      if(root2==null||root1==null)
          return false;
      return (root1.val==root2.val)&&ise(root1.left,root2.left)&&ise(root1.right,root2.right);
    
  }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root==null)
          return false;
        boolean match=false;
        if(root.val==subRoot.val)match=ise(root,subRoot);
        
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)||match;    
    }
}