class Solution {
   
    
    public int minFlipsMonoIncr(String s) {
        int countOne = 0;
        int countFlip = 0;
        char [] chArr = s.toCharArray();
        int n = chArr.length;
        for(int i =0; i<n; i++) {
            if(chArr[i] == '1') {
                countOne++;
            }
            if(chArr[i] == '0') {
                if(countOne>0)
                    countFlip++;
            }
            if(countOne < countFlip) {
                countFlip = countOne;
            }
        }
        return countFlip;
    }
}
