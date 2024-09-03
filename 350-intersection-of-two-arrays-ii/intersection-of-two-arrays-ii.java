class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums1)
        hm.put(val,hm.getOrDefault(val,0)+1);

        ArrayList<Integer>list=new ArrayList<>();
        for(int val:nums2)
        {
            if(hm.containsKey(val)&&hm.get(val)>0)
            {
                list.add(val);
                hm.put(val,hm.get(val)-1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}