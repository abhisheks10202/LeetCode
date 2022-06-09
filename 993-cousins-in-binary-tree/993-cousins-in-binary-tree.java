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
    public boolean isCousins(TreeNode root, int x, int y) {
         Queue<TreeNode[]>pq=new LinkedList<>();
        pq.add(new TreeNode[]{root,root});
        // int count=0;
        TreeNode l=null,r=null;
        boolean bool1=true;
        boolean bool2=true;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            int count1=0;
            int count2=0;
            bool1=true;
            bool2=true;
            for(int i=0;i<size;i++)
            {
                TreeNode p[]=pq.poll();
                if(p[0].val==x&&bool1)
                {count1++;
                    l=p[1];
                 bool1=false;
                }
                else if(p[0].val==y&&bool2)
                { count2++;
                 r=p[1];
                bool2=false;
                }
                
                if(p[0].left!=null)pq.add(new TreeNode[]{p[0].left,p[0]});
                if(p[0].right!=null)pq.add(new TreeNode[]{p[0].right,p[0]});
            }
            if(count1==1&&count2==1&&l!=r)
                return true;
        }
        return false;
    }
}