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
    public List<Double> averageOfLevels(TreeNode root) {
        
         Queue<TreeNode>pq=new LinkedList<>();
        List<Double>list=new ArrayList<>();
        pq.add(root);
        long count=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            count=0;
            for(int i=0;i<size;i++)
            {
                TreeNode p=pq.poll();
                count+=p.val;
                
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }
            list.add((double)count/(double)size);
        }
        return list;
    }
}