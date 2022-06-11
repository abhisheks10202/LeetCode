class Solution {
    
    public long numberOfWays(String s) {
        
   int pre[]=new int[s.length()];
        int suf[]=new int[s.length()];
        int z=0;
        int o=0;
        int n=pre.length;
        for(int i=0;i<pre.length;i++)
        {
             z+=s.charAt(i)-'0'==0?1:0;
            o+=s.charAt(i)-'0'==1?1:0;
            pre[i]=z;
            suf[i]=o;
           
            
        }
        long count=0;
        for(int i=1;i<pre.length-1;i++)
        {
            count+=s.charAt(i)-'0'!=0? (pre[i-1]*(pre[n-1]-pre[i])):(suf[i-1])*(suf[n-1]-suf[i]);
        }
                                       return count;
    }
}
 