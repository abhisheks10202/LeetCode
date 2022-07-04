// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int solve(int arr[]){
        int maxS=Integer.MIN_VALUE;
        int max=0;
        int i=0,j=0;
        while(j<arr.length)
        {
            max+=arr[j];
            maxS=Math.max(max,maxS);
            if(max<0)
            max=0;
            j++;
        }
        // System.out.println(maxS);
        return maxS;
    }
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int j=0;j<C;j++)
        {
             int arr[]=new int[R];
            for(int k=j;k<C;k++)
            {
                for(int i=0;i<R;i++)
                {
                    arr[i]+=M[i][k];
                }
                max=Math.max(max,solve(arr));
            }
        }
        return max;
    }
};