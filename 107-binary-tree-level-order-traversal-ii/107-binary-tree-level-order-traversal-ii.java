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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)
            return ans;
       Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        Stack<Integer>no=new Stack<>();
        Stack<Integer>count=new Stack<>();
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                TreeNode p=pq.poll();
                no.push(p.val);
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }
            count.push(size);
        }
        while(!count.isEmpty())
        {
            int size=count.pop();
            List<Integer>list=new ArrayList<>();
            while(size>0)
            {
                list.add(no.pop());
                size--;
            }
           Collections.reverse(list);
            ans.add(list);
        }
        return ans;
    }
}