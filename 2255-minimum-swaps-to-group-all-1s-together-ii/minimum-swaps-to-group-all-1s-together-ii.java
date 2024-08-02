class Solution {
    public int minSwaps(int[] nums) {
        int one=0;
        for(int val:nums)
        if(val==1)one++;
        if(one ==0||one==nums.length) return 0;

        int[] arr=new int[nums.length*2];
        int index=0;
        
        for(int i=0;i<nums.length;i++)
        arr[index++]=nums[i];
        
        // System.out.println(index+" "+arr[index-1]);
        for(int i=0;i<nums.length;i++)
        arr[index++]=nums[i];
        
        for (int val:arr)
        System.out.println(val+" ");
        int min=Integer.MAX_VALUE;
        int i=0;int j=0;
        int zero=0;

        while(j<arr.length)
        {
            if(arr[j]==0)
            zero++;

            if(j-i+1<one)
            {
                j++;
                
            }
            else if(j-i+1==one)
            {
                if(min>zero)
                min=zero;
                if(arr[i]==0)
                zero--;
                i++;
                j++;
            }
        }
        return min;

    }
}