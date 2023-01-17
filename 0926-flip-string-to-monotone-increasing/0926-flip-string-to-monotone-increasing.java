class Solution {
   
    
    public int minFlipsMonoIncr(String s) {
        int countOne = 0;
        int countFlip = 0;
        int ans=0;
        char [] chArr = s.toCharArray();
        int n = chArr.length;
        for(int i =0; i<n; i++) {
            if(chArr[i] == '1') {
                countOne++;
            }
           else
               ans=Math.min(ans+1,countOne);
        }
        return ans;
    }
}
