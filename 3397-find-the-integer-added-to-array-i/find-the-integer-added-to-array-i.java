class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0,sum2=0;
        for(int val:nums2)
        sum2+=val;

        for(int val:nums1)
        sum1+=val;

        int absDiff=sum2-sum1;
       int ans=absDiff/nums1.length;
        return ans;
       


    }
}