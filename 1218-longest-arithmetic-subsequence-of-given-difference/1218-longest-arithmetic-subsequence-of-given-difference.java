class Solution {
    
    public int longestSubsequence(int[] nums, int diff) {
        int n=nums.length;
    HashMap<Integer,Integer> hm=new HashMap<>();
    hm.put(nums[n-1],1);
    int[] dp=new int[n];
    dp[n-1]=1;
    for(int i=n-2;i>=0;i--){
        int nextElem=nums[i]+diff;
        dp[i]=1+hm.getOrDefault(nextElem,0);
        hm.put(nums[i],dp[i]);
    }
    int res=0;
    for(int elem : dp){
        res=Math.max(res,elem);
    }
    return res;
}
}