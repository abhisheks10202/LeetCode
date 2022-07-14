class Solution {
    public boolean check(int val ,ArrayList<ArrayList<Integer>>adj,int[]color)
    {if(color[val]==-1)color[val]=0;
            for(Integer v:adj.get(val))
            {
                if(color[v]==-1)
                {
                    int col=color[val]==1?0:1;
                    color[v]=col;
                   if(!check(v,adj,color))return false;
                }
                else if(color[v]!=-1&&color[v]==color[val])return false;
            }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++)
        {
            adj.add(new ArrayList<>());
        }
        int i=0;
        for(int ar[]:graph)
        {
            for(int val:ar)
            {
                adj.get(i).add(val);
            }
            i++;
        }
        // System.out.println(adj.get(0).get(0));
        int color[]=new int[graph.length+1];
        Arrays.fill(color,-1);
        
        for(i=0;i<graph.length;i++)
        {
            if(color[i]==-1)
            {
                if(!check(i,adj,color))
                    return false;
            }
        }
        return true;
    }
}