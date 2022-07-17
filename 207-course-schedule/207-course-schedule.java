class Solution {
    static int k=0;
static ArrayList<Integer>list=new ArrayList<>();
public boolean check(boolean visited[],boolean dfsV[],int i,ArrayList<ArrayList<Integer>>adj){
        visited[i]=true;
        dfsV[i]=true;
    for(Integer val:adj.get(i))
    { 
        if(!visited[val])
        {
            
            if(check(visited,dfsV,val,adj))return true;
        }
        else if(dfsV[val])return true;
    }
     dfsV[i]=false;
         list.add(i);
    return false;  
 }
    public boolean canFinish(int V, int[][] graph) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        int i=0;
        // if(graph.length==0)return new int[]{0};
        for(int arr[]:graph) adj.get(arr[1]).add(arr[0]);
        boolean visited[]=new boolean[V+1];
        boolean dfsV[]=new boolean[V+1];
        
          Arrays.fill(visited,false);
          int[] topo = new int[V];
        for(i=0;i<V;i++)
        {
            if(!visited[i])
            {
                if(check(visited,dfsV,i,adj))return false;
            }
        }
       return true;
    }
}