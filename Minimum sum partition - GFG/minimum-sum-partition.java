//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i=0;i<n;i++)
	    sum+=arr[i];
	    
	    boolean t[][]=new boolean [n+1][sum+1];
	        for(int j=0;j<sum+1;j++)
	            t[0][j]=false;
	        for(int i=0;i<n+1;i++)
	            t[i][0]=true;
	            
	        for(int i=1;i<n+1;i++)
	        {
	            for(int j=1;j<sum+1;j++)
	            {
	                if(arr[i-1]<=j)
	                {
	                    t[i][j]=(t[i-1][j]||t[i-1][j-arr[i-1]]);
	                }
	                else
	                t[i][j]=(t[i-1][j]);
	            }
	        }
	        int k=0;
	        int arr1[]=new int[sum/2+1];
	        for(int j=0;j<sum/2+1;j++)
	        {
	            if(t[n][j]==true)
	            arr1[k++]=j;
	        }
	        int mn=Integer.MAX_VALUE;
	        for(int i=0;i<arr1.length;i++)
	        {
	             mn=Math.min(mn,sum-2*arr1[i]);
	        }
	        return mn;
	} 
}
