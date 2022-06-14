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
     public void solve(Node root,List<Integer>list,List<List<Integer>>ans){
       
         Queue<Node>pq=new LinkedList<>();
         pq.add(root);
         list.add(root.val);
         ans.add(new ArrayList<>(list));
         while(!pq.isEmpty())
         {
              
             int size=pq.size();
             List<Integer>list1=new ArrayList<>();
             boolean bool=false;
             for(int i=0;i<size;i++)
             {
                 Node p=pq.poll();
                 // List<Integer>list1=new ArrayList<>();
                 
                 for(Node node:p.children)
                 {
                     pq.add(node);
                     list1.add(node.val);
                     bool=true;
                     
                 }
                 
             }
             if(bool)
             ans.add(list1);
         }
        
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
     if(root==null)
        return ans;
        solve(root,list,ans);
        return ans;
    }
}