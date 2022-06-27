class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        
        int sum1=0;
        int sum2=0;
        int sum=0;
        for(int i=0;i<nums1.length;i++)
        {
            sum1+=nums1[i];
            sum2+=nums2[i];
        }
        int max1=Integer.MIN_VALUE;//when sum1 greater
        int max2=Integer.MIN_VALUE ;//when sum2 is greater
            int i=0,j=0;
        while(j<nums1.length){
            if(sum<0)
            {
                sum=0;
                i++;
            }
            sum+=nums1[j]-nums2[j];
            max1=Math.max(max1,sum);
            j++;
        }
        i=0;j=0;sum=0;
         while(j<nums1.length){
            if(sum<0)
            {
                sum=0;
                i++;
            }
            sum+=nums2[j]-nums1[j];
            max2=Math.max(max2,sum);
             j++;
        }
        return sum1+max2>sum2+max1?sum1+max2:sum2+max1;
    }
}