class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long>ts=new TreeSet<>();

        for(int i=0;i<nums.length;i++)
        {
            Long floor=ts.floor(1L*nums[i]+valueDiff);
            Long ceil=ts.ceiling(1L*nums[i]-valueDiff);
            if(floor!=null&&floor>=nums[i]||ceil!=null&&ceil<=nums[i])
                return true;
            ts.add(1L*nums[i]);
            if(ts.size()>=indexDiff+1)
            ts.remove(1L*nums[i-indexDiff]);
        }
        return false;

    }
}