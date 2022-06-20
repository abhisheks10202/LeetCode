class Solution {
    int dp[][];
    public int solve(int grid[][],int r ,int c){
        if(r>=grid.length||r<0)return 0;
        if(c<0||c>=grid[0].length)return (int)1e9;
        if(dp[r][c]!=-1)return dp[r][c];
        int ans=(int)1e9;
        for(int i=c-1;i<=c+1;i++)
        {
            ans=Math.min(ans,solve(grid,r+1,i));
        }
        return dp[r][c]=ans+grid[r][c];
    }
    public int minFallingPathSum(int[][] grid) {
        if(grid.length==1&&grid[0].length==1)
        return grid[0][0];
        dp=new int[205][205];
        for(int arr[]:dp)
            Arrays.fill(arr,-1);
        int min=(int)1e9;
        for(int i=0;i<grid[0].length;i++)
        {
            min=Math.min(min,solve(grid,0,i));
        }
        return min;
    }
}