class Solution {
     public int solve(int arr[][],int i,int dp[][],int pre){
        if(i>=arr.length)return 0;
        if(dp[i][pre]!=-1)return dp[i][pre];
        if(arr[pre][1]<arr[i][0])
        {
            return dp[i][pre]=Math.max(1+solve(arr,i+1,dp,i),solve(arr,i+1,dp,pre) );
        }
        else
       return dp[i][pre]=solve(arr,i+1,dp,pre);
        
    }
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
       int max=-110000;
        int n=arr.length;
       int dp[][]=new int[n+1][n+2];
       for(int a[]:dp)
       Arrays.fill(a,-1);
       for(int i=0;i<n;i++){
         max=Math.max(max, solve(arr,i+1,dp,i));
       }
       return max+1;
    }
}