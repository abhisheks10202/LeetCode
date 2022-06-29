class Solution {
     public static int solve(int n,int a[],int i,int pre,int dp[][])
    {
        if(i>=n)return 0;
        if(dp[i][pre+1]!=-1)return dp[i][pre+1];
        if(pre==-1||a[i]>a[pre])
        return dp[i][pre+1]=Math.max(1+solve(n,a,i+1,i,dp),solve(n,a,i+1,pre,dp));
        else return dp[i][pre+1]=solve(n,a,i+1,pre,dp);
    }
    public int lengthOfLIS(int[] a) {
        int size=a.length;
        int dp[][]=new int[size+1][size+2];
        for(int aee[]:dp)
        Arrays.fill(aee,-1);
        return solve(size,a,0,-1,dp);
    }
}