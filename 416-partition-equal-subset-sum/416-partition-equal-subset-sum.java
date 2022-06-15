class Solution {
    public int solve(int nums[],int i,int sum,int target,int dp[][]){
        if(i>=nums.length)
            return 0;
        if(dp[i][sum]!=-1)return dp[i][sum];
        if(sum==target)
        {
            return dp[i][sum]=1;
        }
        if(sum<nums[i]){
            return dp[i][sum]=solve(nums,i+1,sum,target,dp);
        }
        else
        {
        int val=solve(nums,i+1,sum-nums[i],target,dp);
        int val2=solve(nums,i+1,sum,target,dp);
        if(val==1||val2==1)
            return dp[i][sum]=1;
        else  return dp[i][sum]=0;
        }
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int val:nums)
            sum+=val;
        if(sum%2!=0)
            return false;
        int dp[][]=new int[nums.length][sum+1];
        for(int arr[]:dp)
            Arrays.fill(arr,-1);
       int a=solve(nums,0,sum,sum/2,dp);
        if(a==0)
            return false;
        return true;
    }
}