
class Solution {
    int ans=0;
    public int solve(TreeNode root){
        if(root==null)
            return 0;
        Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        List<Boolean>list=new ArrayList<>();
        if(root.val%2==0)
            list.add(true);
        else list.add(false);
        int i=0;
         ans=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            boolean bool=false;
           
            for(int j=0;j<size;j++)
            {
                TreeNode p=pq.poll();
                if(i-2>=0&&list.get(i-2)==true)
                {
                    ans+=p.val;
                }
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }if(i>=2)break;
            i++;
        }
        return ans+solve(root.left)+solve(root.right);
    }
    public int sumEvenGrandparent(TreeNode root) {
        
        return solve(root);
        
    }
}