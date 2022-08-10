class Solution {
    
    public static void solve(List<String>ans,String res,String s,List<String>dict,int pos){
    if(pos>=s.length())
    {
        ans.add(res.trim());return;
    }
//       System.out.println(res);
   for(int i=pos;i<s.length();++i){
       if(dict.contains(s.substring(pos,i+1)))
           solve(ans,res+s.substring(pos,i+1)+" ",s,dict,i+1);
   }
    
}
    
    public List<String> wordBreak(String s, List<String> wordDict) {
         List<String>ans=new ArrayList<>();
        String a="";
        solve(ans,a,s,wordDict,0);
      
        return ans;
    }
}