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
    int max=-1;
    public int deepestLeavesSum(TreeNode root) {
        
       
        Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        int d=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            d=0;
            for(int i=0;i<size;i++)
            {
                TreeNode p=pq.poll();
                if(p.left==null&&p.right==null)
                {
                    d+=p.val;
                }
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }
        }
        return d;
    }
}