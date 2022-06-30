// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubsequence(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
     public static int solve(int n,int a[],int i,int pre,int dp[][])
    {
        if(i>=n)return 0;
        if(dp[i][pre+1]!=-1)return dp[i][pre+1];
        if(pre==-1||Math.abs(a[i]-a[pre])==1)
        return dp[i][pre+1]=Math.max(1+solve(n,a,i+1,i,dp),solve(n,a,i+1,pre,dp));
        else return dp[i][pre+1]=solve(n,a,i+1,pre,dp);
    }
    static int longestSubsequence(int size, int a[])
    {
        // code here
        int dp[][]=new int[size+1][size+2];
        for(int aee[]:dp)
        Arrays.fill(aee,-1);
        return solve(size,a,0,-1,dp);
    }
}