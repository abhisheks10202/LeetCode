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
    HashMap<Integer,Integer>hm=new HashMap<>();
    int max=-1;
    public int sum(TreeNode root){
    if(root==null)
        return 0;
    int left=sum(root.left);
    int right=sum(root.right);
    hm.put(root.val+left+right,hm.getOrDefault(root.val+left+right,0)+1);
    max=Math.max(max,hm.get(root.val+left+right));
        return root.val+left+right;
}
    public int[] findFrequentTreeSum(TreeNode root) {
        
        sum(root); 
        int count=0;
        List<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()==max)
                list.add(entry.getKey());
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}