class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        int total=0;
        int max1=Integer.MIN_VALUE;;
        boolean flag=false;
        for(int val:nums)
        {
            if(val>0)
            {  flag=true;
            }
            total+=val;
            max1=Math.max(max1,val);
        }
        if(!flag)return max1;
        
        for(int val:nums)
        {
            sum+=val;
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        
        sum=0;
        int min=Integer.MAX_VALUE;
        
        for(int val:nums)
        {
            sum+=val;
            min=Math.min(min,sum);
            if(sum>=0)
                sum=0;
        }
        return Math.max(max,total-min);
        
    }
}