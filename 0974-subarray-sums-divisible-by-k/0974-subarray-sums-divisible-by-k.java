class Solution {
    public int subarraysDivByK(int[] nums, int k) {
//         Map<Integer,Integer>hm=new HashMap<>();
//         hm.put(0,1);
//         int sum=0;
//         int rem=0;
//         int result=0;
        
//         for(int val:nums)
//         {
//             sum+=val;
//             rem=sum%k;
//             if(rem<0)rem=rem+k;
//             if(hm.containsKey(rem))
//             {
//                 result+=hm.get(rem);
//                 hm.put(rem,hm.get(rem)+1);
//             }
//             else hm.put(rem,1);
//         }
//         return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, remainder; i < nums.length; i++) {
            if (i > 0) nums[i] += nums[i - 1];
            remainder = (nums[i] % k + k) % k;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        int result = map.getOrDefault(0, 0);
        for (int frequency : map.values())
            result += frequency * (frequency - 1) / 2;
        return result;
    }
}