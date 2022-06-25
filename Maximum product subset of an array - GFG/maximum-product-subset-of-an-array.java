// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findMaxProduct(n, arr);
            
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


class Solution {
   
    public static int findMaxProduct(int p, int[] arr) {
        // code here
        int i=0;
        int zero=0;
        int n=0;
        long prod=1;
        int mod=1000000007;
        int max=Integer.MIN_VALUE;
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                zero++;
                i++;
                continue;
            }
            else if(arr[i]<0){
            n++;
            max=Math.max(max,arr[i]);
            }
            prod=(prod*arr[i])%mod;
            i++;
        }
        if(p==zero)
        return 0;
        if(n%2!=0){
            if(n==1&&zero+n==p&&zero>0)return 0;
            else if(n==1&&zero+n==p&&p==1)return (int)prod;
          prod/=max;
        }
            return (int)prod;
        
    }
}
        
