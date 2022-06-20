class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int pivot=i;
            int lv=(pivot-1)>=0?nums[pivot-1]:0;
            int rv=nums[n-1]-nums[pivot];
            if(lv==rv)
                return pivot;
        }
        return -1;
    }
}