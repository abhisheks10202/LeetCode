class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m]; //array to hold increments in rows
        int[] columns = new int[n]; //array to hold increments in columns
        
        for(int i = 0; i < indices.length; i++){
            rows[indices[i][0]] += 1;   //increment the indices of rows array based on "indices" array
            columns[indices[i][1]] += 1; //increment the indices of columns array based on "indices" array
        }
        
        int odds = 0;
        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < columns.length; j++){
                if((rows[i] + columns[j]) % 2 != 0){ //adding rows[i] and columns[j] will give the value in final array. check whether it is odd or even
                    odds += 1; 
                }
            }
        }
        return odds;
    }
}