class Solution {
    public long countSubarrays(int[] nums, long k) {
         long  ans = 0 , sum = 0;
        int l =0;
        for(int i=0;i<nums.length;++i){
            sum = sum + nums[i];
            while(sum * (i-l+1) >= k){
                sum = sum - nums[l];
                l++;
            }            
            ans+=(i-l+1);
        }
 
        return ans;
    }
}