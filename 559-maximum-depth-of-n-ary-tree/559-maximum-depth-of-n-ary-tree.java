/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
         int hi=1;
        for(Node node:root.children){
            hi=Math.max(hi,1+maxDepth(node));
        }
        return hi;
    }
}