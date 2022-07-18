class Solution {
    public int networkDelayTime(int[][] times, int n, int S) {
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int arr[]:times)
        {
            adj.get(arr[0]-1).add(new int[]{arr[1]-1,arr[2]});
        }
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        dist[S-1]=0;
        pq.add(new int[]{0,S-1});
        int max=Integer.MIN_VALUE;
        while(!pq.isEmpty())
        {   int arr[]=pq.poll();
               for(int []list:adj.get(arr[1]))
                {
                    int dis=list[1];
                    int node=list[0];
                    if(dist[arr[1]]+dis<dist[node])
                    {
                        pq.add(new int[]{dis,node});
                        max=Math.max(max,dist[arr[1]]+dis);
                        dist[node]=dist[arr[1]]+dis;
                    }
                }
        }
        Arrays.sort(dist);
        int a=dist[n-1];
        return a==Integer.MAX_VALUE?-1:a;
    }
}