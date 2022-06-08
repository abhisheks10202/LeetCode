class Solution {
    public int countTexts(String pressedKeys) {
        int n=pressedKeys.length();
        int dp[]=new int[n+1];
        int MOD=1000000007;
        dp[0]=dp[1]=1;
        for(int i=1;i<pressedKeys.length();i++)
        {
            char ch=pressedKeys.charAt(i);
            dp[i+1]=dp[i];
            if(ch==pressedKeys.charAt(i-1))
            {
                dp[i+1]+=dp[i-1];
                dp[i+1]=dp[i+1]%MOD;
            if(i>1&&ch==pressedKeys.charAt(i-2))
            {
                dp[i+1]+=dp[i-2];
                dp[i+1]=dp[i+1]%MOD;
            if(i>2&&(ch=='7'||ch=='9')&&ch== pressedKeys.charAt(i-3))
            {
                dp[i+1]+=dp[i-3];
                dp[i+1]=dp[i+1]%MOD;
            }
        }
    }
        }
        return dp[n];
    }
}