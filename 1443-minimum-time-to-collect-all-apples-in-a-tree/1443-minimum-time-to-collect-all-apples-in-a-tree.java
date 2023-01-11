class Solution {
    public int minTime(List<List<Integer>>adj , List<Boolean>hasApple, int source , int parent ){
    int total=0;
    
    for(int i : adj.get(source ))
    {
        if(i== parent ){
            continue ;
        }
        total+= minTime(adj , hasApple , i , source );
    }
    if(  (hasApple.get(source)== true || total >0) ){
        total+=2;
    }
    return total ;
}
// Function to find the minimum time to collect all apples
public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
    // Create an adjacency list to represent the tree
    List<List<Integer>> adj = new ArrayList<>();
    for(int i = 0; i < n; i++){
        adj.add(new ArrayList<>());
    }
    for(int [] edge : edges){
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
    }
    int f =0;
    for(boolean i: hasApple){
        if(i== false ){
            f++;
        }
    }
    if(f==n){
        return 0;
    }
    return minTime(adj ,hasApple, 0, 0 )-2 ;
}
}