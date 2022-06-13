class Solution {
   
    public long[] kthPalindrome(int[] queries, int n) {
        // int n=
        long limit=(long)(9*Math.pow(10,(n-1)/2));
        
       long arr[]=new long[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            if(queries[i]>limit)
                arr[i]=-1;
            else
            {
                long chk=(long)(Math.pow(10,(n-1)/2));
                long val=chk+(long)queries[i]-1;
                String s=""+val;
                 StringBuilder input = new StringBuilder(s);
                input.reverse();
                String l=input.toString();
                if(n%2!=0)
                {
                    s=s+l.substring(1);
                }
                else s=s+l;
                arr[i]=Long.parseLong(s);
            }
        }
        return arr;
    }
}