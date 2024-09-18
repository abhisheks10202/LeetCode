class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        int i=0;
        for(int val:nums)
        arr[i++]= String.valueOf(val);

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        i=0;
        String ans="";
        while(i<arr.length)
        {
            if(arr[0].equals("0"))
            return "0";
            else
            ans+=arr[i];
            i++;
        }
        return ans;
       
    }
}