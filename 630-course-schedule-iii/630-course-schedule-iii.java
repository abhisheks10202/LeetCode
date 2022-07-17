class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b)->(a[1]-b[1]));
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        int days=0;
        int count=0;
        for(int a[]:courses)
        {
            days+=a[0];
            pq.add(a[0]);
            if(days>a[1])
                days-=pq.poll();
        }
        return pq.size();
    }
}