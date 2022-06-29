// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        String s1=str;
        String s2=str;
        int x=str.length();
        int y=x;
        int dp[][]=new int[x+1][y+1];
        for(int i=0;i<dp.length;i++)
        dp[i][0]=0;
         for(int i=0;i<dp[0].length;i++)
            dp[0][i]=0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1)&&i!=j)
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[x][y];
    }
}