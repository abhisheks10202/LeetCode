// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String arr[] = in.readLine().trim().split("\\s+");
            int S = Integer.parseInt(arr[0]);
            int N = Integer.parseInt(arr[1]);
            int M = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minimumDays(S, N, M));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumDays(int days, int max, int pd){
        // code here
       if(pd*days>(max*(days-days/7)) )
       return -1;
        int i=1;
        int count=0;
        int quant=0;
        while(i<=days)
        {
            // if(quant<pd&&i%7==0)
            // return -1;
            if(quant<pd){
                quant+=max;
                count++;
            }
            quant-=pd;
            i++;
        }
        return count;
    }
}