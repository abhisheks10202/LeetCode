class Solution {
    public int findMiddleIndex(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
            pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]+nums[i];
            // System.out.println(pre[i]);
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            suf[i]=suf[i+1]+nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pre[i]==suf[i])
                return i;
        }
        return -1;
    }
}