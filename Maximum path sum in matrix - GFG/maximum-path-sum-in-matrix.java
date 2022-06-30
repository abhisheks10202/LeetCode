// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int solve(int mat[][],int i,int j,int dp[][]){
        if(i<0||j<0||i>=mat.length||j>=mat[0].length){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=Math.max(mat[i][j]+solve(mat,i+1,j,dp), Math.max( mat[i][j]+solve(mat,i+1,j-1,dp), mat[i][j]+solve(mat,i+1,j+1,dp)) );
    }
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int dp[][]=new int[N+1][N+1];
        for(int a[]:dp)
        Arrays.fill(a,-1);
        int max=-100;
        for(int j=0;j<N;j++)
        {
            max=Math.max(max,solve(Matrix,0,j,dp));
        }
        return max;
        
    }
}