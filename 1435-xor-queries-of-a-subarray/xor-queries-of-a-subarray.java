class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int array[]=new int[queries.length];
        int k=0;
        for(int i=0;i<queries.length;i++)
        {   int xor=0;
            for(int j=queries[i][0];j<=queries[i][1];j++)
            {
                xor^=arr[j];
            }
            array[k++]=xor;
        }
        return array;
    }
}