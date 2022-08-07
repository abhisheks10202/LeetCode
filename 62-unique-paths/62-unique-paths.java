class Solution {
    public int solve(int dp[][],int i,int j,int m,int n){
         if(i>=m||j>=n)return 0;
        if(i==m-1&&j==n-1)return 1;
       
        if(dp[i][j]!=-1)return dp[i][j];
        
        return dp[i][j]=solve(dp,i+1,j,m,n)+solve(dp,i,j+1,m,n);
    }
    public int uniquePaths(int m, int n) {
        
        int dp[][]=new int[m][n];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        
        return solve(dp,0,0,m,n);
        
    }
}