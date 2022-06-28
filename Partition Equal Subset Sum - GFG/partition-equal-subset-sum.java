// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    public static boolean solve(int arr[],int sum,int n){
        
        boolean dp[][]=new boolean[n+1][sum+1];
        
        
        for(int i=0;i<dp[0].length;i++)
        dp[0][i]=false;
        for(int i=0;i<dp.length;i++)
        dp[i][0]=true;
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int val:arr)
            sum+=val;
        if(sum%2!=0)return 0;
        boolean bool=solve(arr,sum/2,N);
        if(bool==true)return 1;
        else return 0;
    }
}