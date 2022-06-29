// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution

{ public static int solve(int n,int a[],int i,int pre,int dp[][])
    {
        if(i>=n)return 0;
        if(dp[i][pre+1]!=-1)return dp[i][pre+1];
        if(pre==-1||a[i]>a[pre])
        return dp[i][pre+1]=Math.max(a[i]+solve(n,a,i+1,i,dp),solve(n,a,i+1,pre,dp));
        else return dp[i][pre+1]=solve(n,a,i+1,pre,dp);
    }
    
	public int maxSumIS(int arr[], int n)  
	{  
	    int dp[][]=new int[n+1][n+2];
        for(int aee[]:dp)
        Arrays.fill(aee,-1);
        return solve(n,arr,0,-1,dp);
	}  
}