class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        int ans [] =new int[1];
        if(root==null)
            return 0;
       HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        help(ans,targetSum,root,map,0);
        return ans[0];
        
    }
    private void help(int [] ans,int targetSum,TreeNode root,HashMap<Integer,Integer> map,int current_sum){
        
        if(root==null)
            return ;
        
        current_sum +=root.val;
        // if(current_sum-targetSum==0){
        //      System.out.println(list);
        //     ans[0]++;
        // }
       if(map.containsKey(current_sum-targetSum)){
           ans[0] +=map.get(current_sum-targetSum);
       }
       map.put(current_sum,map.getOrDefault(current_sum,0)+1);
        help(ans,targetSum,root.left,map,current_sum);
      //  list.remove(list.size()-1);
        help(ans,targetSum,root.right,map,current_sum);
       map.put(current_sum,map.get(current_sum)-1);  
       
    }
}