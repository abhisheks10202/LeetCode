class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:allowed.toCharArray())
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        int count=0;
        for(int i=0;i<words.length;i++)
        {   int size=0;
            for(int j=0;j<words[i].length();j++)
            {
                char ch=words[i].charAt(j);
                if(hm.containsKey(ch)==true)
                {
                    size++;
                }

            }if(size==words[i].length())
            count++;
        }
        return count;
    }
}