class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m=grid.length;
        int n=grid[0].length;
        int cost[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            cost[0][i]=grid[0][i];
        }
        
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int costFromP=Integer.MAX_VALUE;
                for(int k=0;k<n;k++)
                {
                    costFromP=Math.min(costFromP,moveCost[grid[i-1][k]][j]+cost[i-1][k]);
                }
                cost[i][j]=costFromP+grid[i][j];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,cost[m-1][i]);
        }
        return min;
    }
}