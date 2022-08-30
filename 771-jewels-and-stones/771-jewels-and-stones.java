class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character>list=new ArrayList<>();
        int count=0;
        for(char ch:jewels.toCharArray())
            list.add(ch);
        for(char ch:stones.toCharArray())
        {
            if(list.contains(ch))count++;
        }return count;
    }
}