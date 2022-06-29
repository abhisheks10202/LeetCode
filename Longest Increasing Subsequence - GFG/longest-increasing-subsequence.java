// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} // } Driver Code Ends




class Solution 
{
    public static int solve(int n,int a[],int i,int pre,int dp[][])
    {
        if(i>=n)return 0;
        if(dp[i][pre+1]!=-1)return dp[i][pre+1];
        if(pre==-1||a[i]>a[pre])
        return dp[i][pre+1]=Math.max(1+solve(n,a,i+1,i,dp),solve(n,a,i+1,pre,dp));
        else return dp[i][pre+1]=solve(n,a,i+1,pre,dp);
    }
    static int longestSubsequence(int size, int a[])
    {
        // code here
        // int max=-1;
        int dp[][]=new int[size+1][size+2];
        for(int aee[]:dp)
        Arrays.fill(aee,-1);
        return solve(size,a,0,-1,dp);
    }
} 