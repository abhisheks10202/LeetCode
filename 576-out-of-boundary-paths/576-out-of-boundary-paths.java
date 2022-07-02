class Solution {
     int count=0;
    int dirs[][]=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    int mod= (int)1e9 + 7;
    public int solve(int dp[][][],int i,int j,int n,int m,int k){
         
        if( i<0||j<0||i>=n||j>=m)return 1; 
            if(k==0)return 0;
       
      
     if(dp[k][i][j]!=-1)return dp[k][i][j];
        int a=0;
        for(int dir[]:dirs)
        {
            int x=dir[0]+i;
            int y=dir[1]+j;
            a+=solve(dp,x,y,n,m,k-1);
            a%=mod;
        }
       return dp[k][i][j]=a;
    }
    public int findPaths(int m, int n, int k, int row, int column) {
        int dp[][][]=new int[k+1][m][n];
        for(int arr[][]:dp)
        {
            for(int a[]:arr)
                Arrays.fill(a,-1);
        }
        return solve(dp,row,column,m, n, k);
    }
}
