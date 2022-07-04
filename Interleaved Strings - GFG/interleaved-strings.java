// { Driver Code Starts
//initial code
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            Solution g=new Solution();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}

// } Driver Code Ends


/*you are required to complete this method */
class Solution {
    public int solve(String a,String b,String c,int i,int j,int k,int dp[][]){
        if(k>=c.length())return 1;
        if(dp[i][j]!=-1)return dp[i][j];
     
        int b1=0;
        int b2=0;
        if(i<a.length()&&a.charAt(i)==c.charAt(k))
        b1=solve(a,b,c,i+1,j,k+1,dp);
        if(j<b.length()&&b.charAt(j)==c.charAt(k))
        b2=solve(a,b,c,i,j+1,k+1,dp);
        return dp[i][j]= b1==1?1:(b2==1?1:0) ;
        
    }
	public boolean isInterLeave(String a,String b,String c)
	{
            //Your code here
            if(a.length()+b.length()!=c.length())return false;
            int dp[][]=new int[a.length()+1][b.length()+1];
            for(int k[]:dp)
            Arrays.fill(k,-1);
            return solve(a,b,c,0,0,0,dp)==0?false:true;
	}
}

