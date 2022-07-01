// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().smallestSumSubarray(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int min=Integer.MAX_VALUE;
        // if(a.length==1)return a[0];
        int i=0;int j=0;
        int sum=0;
        while(j<a.length)
        {
            sum+=a[j];
            min=Math.min(min,sum);
            if(sum>0)
            {
                i=j+1;
                sum=0;
            }
            j++;
        }
        return min;
    }
}