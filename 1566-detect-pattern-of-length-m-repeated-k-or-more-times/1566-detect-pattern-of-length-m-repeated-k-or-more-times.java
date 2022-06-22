class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
       int count=0;
        for(int i=0;i<arr.length-m;i++)
        {
            if(arr[i]!=arr[i+m])
                count=0;
            else
                count++;
            if(count>=(k-1)*m)
                return true;
        }
        return false;
    }
}