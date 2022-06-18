
class Solution {

    public TreeNode build(int preorder[],int preStart,int preEnd,int inorder[],int inStart,int inEnd,HashMap<Integer,Integer>inMap){
        
         if(preStart>preEnd||inStart>preEnd)return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        
        int inRoot=inMap.get(root.val);
        int numLeft=inRoot-inStart;
        
        root.left=build(preorder,preStart+1,preStart+numLeft,inorder,inStart,inRoot-1,inMap);
        
         root.right=build(preorder,preStart+numLeft+1,preEnd,inorder,inRoot+1,inEnd,inMap);
        
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int i=0;
        int inorder[]=new int[preorder.length];
        for(int val:preorder)
            inorder[i++]=val;
        Arrays.sort(inorder);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for( i=0;i<preorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hm);
        return root;
    }
}