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
    int n,m=0;
    public int solve(TreeNode root,String ans,int count){
        // ans+=root.val;
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
        { 
            ans+=root.val;
            String str=ans;
            ans=ans.substring(0,ans.length()-1);
            return binary(str);
            
            
        }
        
       return solve(root.left,ans+root.val,count)+solve(root.right,ans+root.val,count);
        
    }
    public int binary(String str){
         // System.out.println(str );
       //  int n=Integer.parseInt(str);
       // str=(Integer.toBinaryString(n));
        // System.out.println( Integer.parseInt(str,2)+"-----" );
        return Integer.parseInt(str,2);
    }
    public int sumRootToLeaf(TreeNode root) {
        int count=0;
        return solve(root,"",count);
        // return count;
    }
}