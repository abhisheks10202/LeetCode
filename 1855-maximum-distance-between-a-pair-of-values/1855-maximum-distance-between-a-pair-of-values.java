class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
     if(nums1[nums1.length-1]>nums2[0])
         return 0;
        int i=0;
        int j=0;
        int max=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]<=nums2[j]&&i<=j)
            {
                max=Math.max(max,j-i);
                j++;
            }
            else if(nums1[i]>nums2[j])
            {i++;}
            else if(i>j)
                j++;
        }
        return max==0?0:max;
        
    }
}