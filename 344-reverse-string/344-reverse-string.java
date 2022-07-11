class Solution {
    public void solve(char []s,int i,int j){
        if(i>s.length||j<0||i>j)return ;
        char ch=s[i];
        s[i]=s[j];
        s[j]=ch;
        solve(s,i+1,j-1);
    }
    public void reverseString(char[] s) {
        solve(s,0,s.length-1);
    }
}