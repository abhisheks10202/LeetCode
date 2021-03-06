// { Driver Code Starts
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
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int X = Integer.parseInt(input[1]);
            int Y = Integer.parseInt(input[2]);
            Solution ob = new Solution();
            int ans = ob.findWinner(N,X,Y);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int findWinner(int N,int X,int Y)
    {
        // Code here
        boolean dp[]=new boolean[N+1];
        dp[0]=false;
        dp[1]=true;
        for(int i=2;i<=N;i++)
        {
            if(i-1>=0&&dp[i-1]==false)
            dp[i]=true;
            if(i-X>=0&&dp[i-X]==false)
            dp[i]=true;
            if(i-Y>=0&&dp[i-Y]==false)
            dp[i]=true;
        }
        return dp[N]==true?1:0;
    }
}