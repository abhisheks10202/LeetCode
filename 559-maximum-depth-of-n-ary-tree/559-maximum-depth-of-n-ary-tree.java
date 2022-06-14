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
    public int solve(Node root,int len,List<Integer>list){
        Queue<Node>pq=new LinkedList<>();
        pq.add(root);
        int count=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            count++;
            for(int i=0;i<size;i++)
            {
                Node p=pq.poll();
                pq.addAll(p.children);
            }
        }
        return count;
        
    }
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
         List<Integer>list=new ArrayList<>();
        int len=0;
        return solve(root,len,list);
    }
}