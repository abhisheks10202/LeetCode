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
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public static boolean isPalindrome(String str,int i,int j){
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;j--;
        }
        return true;
    }
    public static int solve(String str,int dp[][],int i,int j){
        if(i>=j)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        if(isPalindrome(str,i,j))return 0;
        int mn=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int temp=1+solve(str,dp,i,k)+solve(str,dp,k+1,j);
            mn=Math.min(mn,temp);
        }return dp[i][j]=mn;
    }
    static int palindromicPartition(String str)
    {
        // code here
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int a[]:dp)
        Arrays.fill(a,-1);
        
        return solve(str,dp,0,n-1);
        
    }
}