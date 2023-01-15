class Solution {
     public int numberOfGoodPaths(int[] vals, int[][] edges) {
        int n = vals.length;
        int[] sz = new int[n];
        int[] cur = new int[n];
        int[] cnt = new int[n];
        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            sz[i] = 1;
            cur[i] = vals[i];
            cnt[i] = 1;
            par[i] = i;
        }
        int ans = n;
        Arrays.sort(edges, (a, b) -> Math.max(vals[a[0]], vals[a[1]]) - Math.max(vals[b[0]], vals[b[1]]));
        for (int[] edge : edges) {
            ans += connect(edge[0], edge[1], par, sz, cur, cnt);
        }
        return ans;
    }

    private int connect(int i, int j, int[] par, int[] sz, int[] cur, int[] cnt) {
        i = getRoot(i, par);
        j = getRoot(j, par);
        if (i != j) {
            if (sz[i] < sz[j]) {
                int temp = i;
                i = j;
                j = temp;
            }
            par[j] = i;
            sz[i] += sz[j];
            if (cur[i] == cur[j]) {
                int r = cnt[i] * cnt[j];
                cnt[i] += cnt[j];
                return r;
            } else if (cur[i] < cur[j]) {
                cur[i] = cur[j];
                cnt[i] = cnt[j];
            }
        }
        return 0;
    }

    private int getRoot(int i, int[] par) {
        if (i == par[i]) {
            return i;
        }
        par[i] = getRoot(par[i], par);
        return par[i];
    }
}