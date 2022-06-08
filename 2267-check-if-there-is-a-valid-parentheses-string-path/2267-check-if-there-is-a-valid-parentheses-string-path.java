class Solution {
    Boolean dp[][][];
    public boolean hasValidPath(char[][] grid) 
    {
        dp=new Boolean[grid.length][grid[0].length][grid.length+grid[0].length];
        return helper(grid,0,0,0);
    }
    public boolean helper(char[][] grid,int i,int j,int start)
    {
        if(i>=grid.length || j>=grid[0].length) return false;
        if(grid[i][j]=='(')
            start++;
        else
            start--;
        if(start<0) return false;
        if(i==grid.length-1 && j==grid[0].length-1) return start==0;
        if(dp[i][j][start]!=null) return dp[i][j][start];
        dp[i][j][start]=(helper(grid,i+1,j,start) || helper(grid,i,j+1,start));
        return dp[i][j][start];
    }
}