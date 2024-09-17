class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>hm=new HashMap<>();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        for(String str:arr1)
        hm.put(str,hm.getOrDefault(str,0)+1);
        for(String str:arr2)
        hm.put(str,hm.getOrDefault(str,0)+1);
        
        List<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer>e:hm.entrySet())
        {
            if(e.getValue()==1)
            list.add(e.getKey());
        }
         String[] answer = Arrays.copyOf(
            list.toArray(), list.size(), String[].class);
            return answer;
    }
}