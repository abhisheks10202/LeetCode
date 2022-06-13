class Solution {
    public boolean matchReplacement(String s, String sub, char[][] mappings) {
    
        boolean map[][] =new boolean[256][256];
        for(boolean a[]:map)
        {
            Arrays.fill(a,false);
        }
        for(int i=0;i<256;i++)
        {
            map[i][i]=true;
        }
        for(char[]ch:mappings)
        {
            map[ch[0]][ch[1]]=true;
        }
        int n=s.length();
        int m=sub.length();
       
        for(int i=0;i<n-m+1;i++)
        { boolean is_allowed=true;
            for(int j=0;j<m;j++)
            {   char ch1=sub.charAt(j);
                char ch2=s.charAt(i+j);
                if(map[ch1][ch2]==false)
                {
                    is_allowed=false;
                }
            }
            if(is_allowed)
                return true;
        }
        return false;
    }
             
}