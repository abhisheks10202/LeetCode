// { Driver Code Starts
// Driver Code
import static java.lang.System.out;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-->0;) {
            int n = in.nextInt();
            
            Geeks obj = new Geeks();
            out.println(obj.count(n));
        }
    }
}// } Driver Code Ends


// Complete this function!

class Geeks {
    public long solve(int n,int arr[],long dp[][],int i){
        if(n==0)return 1;
        if(n<0||i==3)return 0;
        if(dp[n][i]!=-1)return dp[n][i];
        long a=0;
        long b=0;
      
            a=solve(n-arr[i],arr,dp,i);
            b=solve(n,arr,dp,i+1);
        return dp[n][i]=a+b;
    }
    public long count(int n) {
        long[][] dp = new long[n+1][3];
       for(long a[]:dp)
        Arrays.fill(a, -1);
        int arr[]=new int[]{3,5,10};
        return solve(n,arr,dp,0);
    }
}