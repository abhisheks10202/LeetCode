class Solution {
    public int maximalSquare(char[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int[n][m];
       
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(mat[i][j]=='0')
                dp[i][j]=0;
                else if(i==n-1&&j==m-1|| (i==n-1)||j==(m-1))
                dp[i][j]=(mat[i][j])=='0'?0:1;
                else 
                dp[i][j]=1+Math.min(dp[i][j+1],Math.min(dp[i+1][j],dp[i+1][j+1]) );
            }
        }
        int max=-100;
        for(int i=0;i<n;i++)
        {
            for(int val:dp[i])
            max=Math.max(val,max);
        }
        return max*max;
    }
}