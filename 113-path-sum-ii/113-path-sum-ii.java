
class Solution {
    List<List<Integer>>ans=new ArrayList<>();
     public void solve(TreeNode root,int sum,List<Integer>list){
        if(root==null)
        {
            return; 
        }
         list.add(root.val);
         if(sum==root.val&&root.left==null&&root.right==null)
           {
             ans.add(new ArrayList<>(list));
             // return;
         }
        solve(root.left,sum-root.val,list);
        solve(root.right,sum-root.val,list);
        list.remove(list.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
          if(root==null)
            return ans;
        solve(root,targetSum,new ArrayList<>());
        return ans;
    }
}
