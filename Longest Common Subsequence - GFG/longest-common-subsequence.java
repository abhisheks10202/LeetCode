// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int[2][y+1];
        for(int i=0;i<dp.length;i++)
        dp[i][0]=0;
         for(int i=0;i<dp[0].length;i++)
            dp[0][i]=0;
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i%2][j]=1+dp[(i+1)%2][j-1];
                }
                else
                dp[i%2][j]=Math.max(dp[(i+1)%2][j],dp[i%2][j-1]);
            }
        }
        return dp[x%2][y];
    }
    
}