class Solution {
    int count=0;
    int all=0;
    int dirs[][]=new int[][]{{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}};
    public double solve(double dp[][][],int i,int j,int n,int k){
          if(i<0||j<0||i>=n||j>=n)
            return 0.0; 
        if(k==0){    
            return 1.0;
        }
        double a=0;
     if(dp[k][i][j]!=0.0)return dp[k][i][j];
        
        for(int dir[]:dirs)
        {
            int x=dir[0]+i;
            int y=dir[1]+j;
            a+=solve(dp,x,y,n,k-1)/8.0;
        }
       return dp[k][i][j]=a;
    }
    public double knightProbability(int n, int k, int row, int column) {
        double dp[][][]=new double[k+1][n][n];
       
        return solve(dp,row,column, n, k);
    }
}
