
class Solution {
    String res = "";
    public String smallestFromLeaf(TreeNode root){
        dfs(root,"");
        return res;
    }
    public void dfs(TreeNode root,String sb){
        if(root == null) return;
        char c = (char)('a' + root.val);
        
        if(root.left == null && root.right == null){
            String s = new StringBuilder(sb + c).reverse().toString();
            if(res == "") res = s;
            else if(res.compareTo(s) > 0)
                res = s;
        }
        else{
            dfs(root.left,sb + c);
            dfs(root.right,sb + c);
        }
    }
}