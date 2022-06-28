// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int S[], int m, int n) {
        // code here.
        long t[][]=new long[m+1][n+1];
    
            for(int i=0;i<t[0].length;i++)
                t[0][i]=0;
            for(int i=0;i<t.length;i++)
                 t[i][0]=1;
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(S[i-1]<=j){
                    t[i][j]=t[i][j-S[i-1]]+t[i-1][j];
                }
                else
                t[i][j]=t[i-1][j];
            }
        }
        return t[m][n];
    }
}