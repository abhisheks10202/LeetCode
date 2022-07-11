// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String a){
        // code here
         int start=0;
             int end=0;
         for(int i=0;i<a.length();i++)
         {
             int l=i;
             int r=i+1;
            
             while(l>=0&&r<a.length()&&a.charAt(l)==a.charAt(r))
             {
                 if(end-start<r-l)
                 {
                     start=l;
                     end=r;
                 }
                 l--;r++;
             }
             l=i;
             r=i+2;
              while(l>=0&&r<a.length()&&a.charAt(l)==a.charAt(r))
             {
                 if(end-start<r-l)
                 {
                     start=l;
                     end=r;
                 }
                 l--;r++;
             }
         }
         return a.substring(start,end+1);
    }
}