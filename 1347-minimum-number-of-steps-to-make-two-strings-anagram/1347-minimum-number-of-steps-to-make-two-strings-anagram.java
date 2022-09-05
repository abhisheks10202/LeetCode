class Solution {
    public int minSteps(String s, String t) {
        
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            sArr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++){
            tArr[t.charAt(i) - 'a']++;
        }
        
        int count = 0;
        for(int i = 0; i < sArr.length; i++){
            sArr[i] -= tArr[i];
            
            if(sArr[i] > 0){
                count += sArr[i];
            }
        }
        
        return count;
    }

}