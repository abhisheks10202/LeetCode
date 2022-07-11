class Solution {
    public void solve(StringBuilder s,int i,int j){
        if(i>s.length()||j<0||i>j)return ;
        char ch=s.charAt(i);
        s.setCharAt(i,s.charAt(j));
        s.setCharAt(j,ch);
        solve(s,i+1,j-1);
        // return s.toString();
    }
    public String reverseWords(String k) {
        String arr[]=k.split(" ");
        String s="";
        for(int i=0;i<arr.length;i++)
        {
           StringBuilder sb=new StringBuilder(arr[i]);
            solve(sb,0,sb.length()-1);
            s+=sb.toString()+" ";
        }
       s= s.trim();
        return s;
    }
}