// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(arr, n)); 
        }
    }
    
    
}// } Driver Code Ends



class solve
{
    static long max=0;
    public static long solves(int arr[],int i,int j,long dp[][]){
        if(i>=j)return 0;
        long val=0;
        if(dp[i][j]!=-1)return dp[i][j];
    //   if(j-i==1)return Math.max(arr[i],arr[j]);
       if((i+j)%2!=0)
       return dp[i][j]=Math.max( arr[i]+solves(arr,i+1,j,dp),arr[j]+solves(arr,i,j-1,dp));
       else
       return dp[i][j]=Math.min(solves(arr,i+1,j,dp),solves(arr,i,j-1,dp) );
        
    }
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        // Your code here
    long dp[][]=new long[n][n];
    for(long a[]:dp)
    Arrays.fill(a,-1);
        return solves(arr,0,n-1,dp);

    }
}
