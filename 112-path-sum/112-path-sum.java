class Solution {
    public boolean solve(TreeNode root,int sum){
        if(root==null)
            return false;
          sum-=root.val;
         if(sum==0&&root.left==null&&root.right==null)
            return true;
        return solve(root.left,sum)||solve(root.right,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return solve(root,targetSum);
    }
}