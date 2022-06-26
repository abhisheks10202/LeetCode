// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Collections;


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int N = sc.nextInt();
            int[] Arr = new int[N];
            for (int i = 0; i < N; ++i){
                Arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.minSubset(Arr,N);
            System.out.println(ans);
            t--;
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution { 
    int minSubset(int[] arr,int n) { 
          Arrays.sort(arr);
       long totsum=0;
       for(int i=0;i<n;i++)
       totsum+=arr[i];
       
       if(totsum==0) return n;
       int l=n-1;
       long sum=0;
       for(int j=n-1;j>=0;j--)
       {
           sum+=arr[j];
           totsum-=arr[j];
           if(totsum<sum)
           return n-j;
       }
       return 0;
    }
}