// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String s1, String s2, int n1, int n2){
        // code here
        // System.out.println(s1+" "+s2);
        int max=-100;
        int dp[][]=new int[n1+1][n2+1];
        for(int i=0;i<n1+1;i++)dp[i][0]=0;
        for(int i=0;i<n2+1;i++)dp[0][i]=0;
        for(int i=1;i<n1+1;i++)
        {
            for(int j=1;j<n2+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=(1+dp[i-1][j-1]);
                   max=Math.max(max,dp[i][j]);
                    
                }
                else dp[i][j]=0;
            }
        }
        return max==-100?0:max;
        
    }
}