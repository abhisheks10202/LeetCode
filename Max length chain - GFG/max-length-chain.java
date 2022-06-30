// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class Chainlength
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Pair pr[] = new Pair[n];
            int arr[] = new int[2*n];
            for(int i = 0; i < 2*n; i++)
            {
               arr[i] = sc.nextInt();
            }
            for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
            {
                pr[j] = new Pair(arr[i], arr[i+1]);
            }
            GfG g = new GfG();
            System.out.println(g.maxChainLength(pr, n));
        }
    }
}
// } Driver Code Ends


class CompareByFirst implements Comparator<Pair>
{
  public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}

class GfG
{
    public int solve(Pair arr[],int i,int dp[][],int pre){
        if(i>=arr.length)return 0;
        if(dp[i][pre]!=-1)return dp[i][pre];
        if(arr[pre].y<arr[i].x)
        {
            return dp[i][pre]=Math.max(1+solve(arr,i+1,dp,i),solve(arr,i+1,dp,pre) );
        }
        else
       return dp[i][pre]=solve(arr,i+1,dp,pre);
        
    }
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Arrays.sort(arr, new CompareByFirst());
       int max=-110000;
       int dp[][]=new int[n+1][n+2];
       for(int a[]:dp)
       Arrays.fill(a,-1);
       for(int i=0;i<n;i++){
         max=Math.max(max, solve(arr,i+1,dp,i));
       }
       return max+1;
       
    }
}