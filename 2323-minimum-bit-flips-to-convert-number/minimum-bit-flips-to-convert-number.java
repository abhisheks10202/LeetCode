class Solution {
    public int minBitFlips(int start, int goal) {
        String s=Integer.toBinaryString(start);
        String e=Integer.toBinaryString(goal);
       System.out.println(s+" "+e);
        int i=s.length()-1;
        int j=e.length()-1;
        int count=0;
        while(i>=0&&j>=0)
        {
            if(s.charAt(i)!=e.charAt(j))
            count++;
            i--;j--;
        }
        if(i>j)
        {
            for(int k=0;k<=i;k++)
            {
                if(s.charAt(k)=='1')
                count++;
            }
        }
        else if(j>i)
        {
            for(int k=0;k<=j;k++)
            {
                if(e.charAt(k)=='1')
                count++;
            }
        }

        return count;
    }
}