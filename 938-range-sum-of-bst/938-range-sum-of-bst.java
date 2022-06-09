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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        int count=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                TreeNode p=pq.poll();
                // System.out.println(p.val);
                if(p.val>=low&&high>=p.val)
                {count+=p.val;}
                
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }
        }
        return count;

    }
}