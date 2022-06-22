class Solution {
    public long maxTaxiEarnings(int n, int[][] jobs) {
       
        Arrays.sort(jobs,(a,b)->a[1]-b[1]);
        TreeMap<Integer,Long>hm=new TreeMap<>();
        // hm.put(0,0l);
        long ans=0;
        for(int[] job:jobs)
        {
            Integer val=hm.floorKey(job[0]);
            long v=val==null?0:hm.get(val);
            ans=Math.max(ans,v+job[1]-job[0]+job[2]);
            hm.put(job[1],ans);
        }
        return ans;
    }
}