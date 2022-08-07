class Solution {

    public int uniquePathsWithObstacles(int[][] Grid) {
        int m = Grid.length;
        int n = Grid[0].length;
        if(Grid[m-1][n-1] == 1 || Grid[0][0] == 1) return 0;
        
        int dp[][] = new int [m][n];
        for(int i = m-1; i >= 0; i--){
            if(Grid[i][n-1] == 1) break;
            dp[i][n-1] = 1;
        }
        for(int i = n-1; i >= 0; i--){
            if(Grid[m-1][i] == 1) break;
            dp[m-1][i] = 1;
        }
        for(int i = m-2; i >= 0; i--){
            
            for(int j = n-2; j >= 0; j--){
                if(Grid[i][j] != 1){
                    int right = 0; int bottom = 0;
                    if(Grid[i][j+1] != 1) right = dp[i][j+1];
                    if(Grid[i+1][j] != 1) bottom = dp[i+1][j];
                    // if(right == 0 && right == 0) break;
                    dp[i][j] = right + bottom;
                }
            }
        }
     
        return dp[0][0];
    }
}