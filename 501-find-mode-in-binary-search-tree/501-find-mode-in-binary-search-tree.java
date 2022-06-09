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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int freq=0;
         Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        int count=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                TreeNode p=pq.poll();
               
               hm.put(p.val,hm.getOrDefault(p.val,0)+1);
                if(freq<hm.get(p.val))
                    freq=hm.get(p.val);
                
                if(p.left!=null)pq.add(p.left);
                if(p.right!=null)pq.add(p.right);
            }
        }
        List<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()==freq)
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