// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    // int sum=0;
    public  static int solve(int arr[][],int i,int j,int dp[][],int n,int m){

    if(i<0||j<0||i>=n||j>=m)
        return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];
    int val1=0,val2=0,val3=0;
        
       
             val1=arr[i][j]+solve(arr,i-1,j+1,dp,n,m);
             val2=arr[i][j]+solve(arr,i,j+1,dp,n,m);
             val3=arr[i][j]+solve(arr,i+1,j+1,dp,n,m);
        return dp[i][j]=Math.max(val1,Math.max(val2,val3));
    }
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int dp[][]=new int[n+1][m+1];
        for(int ar[]:dp)
        Arrays.fill(ar,-1);
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            
            max=Math.max(max,solve(M,i,0,dp,n,m));
        }
        return max;
    }
}