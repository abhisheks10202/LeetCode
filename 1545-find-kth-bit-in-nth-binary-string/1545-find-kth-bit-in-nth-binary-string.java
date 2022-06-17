class Solution {
    public String solve(int n){
        if(n==1)
        {
            return "0";
        }
        String s=solve(n-1);
        String ans=s+"1";
        ans+=reverse(invert(s));
        return ans;
    }
    public String invert(String str){
        StringBuilder sb=new StringBuilder(str);
        int i=0;
        while(i<sb.length()){
            if(sb.charAt(i)=='0')
                sb.setCharAt(i,'1');
            else
                sb.setCharAt(i,'0');
            i++;
        }
        return      sb.toString();
    }
    
        public String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        int i=0;int j=sb.length()-1;
        while(i<j){
            char ch=sb.charAt(j);
            sb.setCharAt(j,sb.charAt(i));
            sb.setCharAt(i,ch);
            i++;j--;
        }
        return      sb.toString();
    }
    
    
    public char findKthBit(int n, int k) {
        
       String s= solve(n);
        return s.charAt(k-1);
    }
}