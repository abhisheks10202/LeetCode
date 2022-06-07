class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        long lsum[]=new long[nums.length];
        long rsum[]=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            lsum[i]=sum;
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            rsum[i]=sum;
        }
        long min=Long.MAX_VALUE;
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            long lavg=(long)Math.floor((double)lsum[i]/(double)(i+1));
             long ravg=0;
            if(i==nums.length-1)
                ravg=0;
            else
            ravg=(long)Math.floor((double)rsum[i+1]/(double)(nums.length-(i+1)));
            long avg=Math.abs(lavg-ravg);
            // System.out.println(lavg+" "+ravg+" "+avg);
           if(min>avg)
           {idx=i;
            min=avg;           
           }
        }
        return idx;
    }
}