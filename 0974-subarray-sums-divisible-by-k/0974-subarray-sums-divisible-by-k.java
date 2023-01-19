class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int rem=0;
        int result=0;
        
        for(int val:nums)
        {
            sum+=val;
            rem=sum%k;
            if(rem<0)rem=rem+k;
            if(hm.containsKey(rem))
            {
                result+=hm.get(rem);
                hm.put(rem,hm.get(rem)+1);
            }
            else hm.put(rem,1);
        }
        return result;
    }
}