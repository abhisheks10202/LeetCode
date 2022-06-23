class Solution {
    public int coinChange(int[] coins, int amount) {
        int t[][]=new int[coins.length+1][amount+1];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(i==0)t[i][j]=Integer.MAX_VALUE-1;
                if(j==0)t[i][j]=0;
            }
        }
        for(int i=1;i<amount+1;i++)
        {
            if(i%coins[0]==0)
            {
                t[1][i]=i/coins[0];
            }
            else
                t[1][i]=Integer.MAX_VALUE-1;
        }
        
        for(int i=2;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(coins[i-1]<=j)
                {
                    t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        if(t[coins.length][amount]==Integer.MAX_VALUE-1)
            return -1;
        else
        return t[coins.length][amount];
    }
}


