class Solution {
    public boolean solve(String s, List<String> wordDict,Map<String,Boolean>hm)
    {
        
        if(s.length()==0)return true;
        if(hm.containsKey(s))return hm.get(s);
        for(int i=0;i<wordDict.size();i++)
        {
            int l=wordDict.get(i).length();
            boolean bool=false;
            if(l<=s.length()&&s.substring(0,l).equals(wordDict.get(i)) &&solve(s.substring(l),wordDict,hm))
            {
                hm.put(s.substring(0,l),true);
               return true;
            }
        }
        hm.put(s,false);
        return false;
        
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String,Boolean>hm=new HashMap<>();
        return solve(s,wordDict,hm);
    }
}