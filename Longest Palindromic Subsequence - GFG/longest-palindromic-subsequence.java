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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String s1)
    {
        //code here
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        // System.out.println(s2);
        int n1=s1.length();
        int n2=s2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=0;i<n1+1;i++)dp[i][0]=0;
        for(int i=0;i<n2+1;i++)dp[0][i]=0;
        for(int i=1;i<n1+1;i++)
        {
            for(int j=1;j<n2+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max( dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n1][n2];
        
    }
}