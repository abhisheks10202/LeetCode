
class Solution {
    public int max(int nums[],int i,int j){
        int res=-1;
        int max=-1000;
        for(int k=i;k<=j;k++)
        {
            if(max<nums[k])
            {
                max=nums[k];
                res=k;
            }
        }
        return res;
    }
    public TreeNode solve(int nums[],int i,int j,int idx){
         if(i>j)
             return null;
         idx=max(nums,i,j);
        TreeNode root=new TreeNode(nums[idx]);
        root.left=solve(nums,i,idx-1,idx);
        root.right=solve(nums,idx+1,j,idx);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums,0,nums.length-1,0);
            
    }
}