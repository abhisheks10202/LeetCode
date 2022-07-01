// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
   
    int maxSubstring(String S) {
       int i=0;int j=0;
       int max=-1;
       int zero=0;
       int one=0;
       while(j<S.length())
       {
           char ch=S.charAt(j);
           if(ch=='0')
           zero++;
           else one++;
           if(one>zero)
           {
               one=0;
               zero=0;
               i=j+1;
           }
           max=Math.max(max,zero-one);
           j++;
        }
        return max==0?-1:max;
    }
}