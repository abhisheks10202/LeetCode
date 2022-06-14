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
    int min=Integer.MAX_VALUE;
    public int sum(TreeNode root){
    
        Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        int t=0;
        while(!pq.isEmpty())
        {
            t++;
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                TreeNode p=pq.poll();
                if(p.left==null&&p.right==null)
                    return t;
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }
        }
        return -1;
}
    
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return sum(root);
    }
}