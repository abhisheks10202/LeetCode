class Solution{
public int minSwaps(int[][] grid) {
        int n = grid.length;
        ArrayList<Integer> cnt = new ArrayList();
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 1) break;
                c++;
            }
            cnt.add(c);
        }
        
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int target = n - i - 1;
            int j = i;
            while (j < n && cnt.get(j) < target) {
                j++;
            }
            if (j == n) return -1;
            swap(cnt, i, j);
            ans += (j - i);
        }
        return ans;
    }
    
    private void swap(ArrayList<Integer> A, int i, int j) {
        int t = A.get(j);
        A.remove(j);
        A.add(i, t);
    }
}