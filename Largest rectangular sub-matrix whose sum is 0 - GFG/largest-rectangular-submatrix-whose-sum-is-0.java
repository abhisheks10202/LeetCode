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


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] nm = IntArray.input(br, 2);
            
            
            int[][] a = IntMatrix.input(br, nm[0], nm[1]);
            
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = obj.sumZeroMatrix(a);
            
            if(res.size() == 0) {
                System.out.println(-1);
                
            } else {
            
                IntMatrix.print(res);
            }        
        }
    }
}
// } Driver Code Ends


class Solution {
     public static int[] len (int arr[], int N, int k) {
      int ans[] =  new int[2];
        int n = arr.length;
        int endingIdx = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum = 0,maxlen = 0;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
            if(mp.containsKey(sum)==true){
                if(maxlen<(i-mp.get(sum))){
                   endingIdx = i;
                   maxlen = i-mp.get(sum);
                }
                
            }else{
                mp.put(sum,i);
            }
        }
        ans[0] = maxlen;
        ans[1] = endingIdx;
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] M) {
        // code here
        int final_length=Integer.MIN_VALUE;
        int starting_row=0, ending_row=0,starting_col=0, ending_col=0;
        int max=Integer.MIN_VALUE;
        int C=M[0].length;
        int R=M.length;
        for(int j=0;j<C;j++)
        {
             int arr[]=new int[R];
            for(int k=j;k<C;k++)
            {
                for(int i=0;i<R;i++)
                {
                    arr[i]+=M[i][k];
                }
               int p[]=len(arr,arr.length,0);
               if(final_length*(ending_col-starting_col+1)<(p[0]*(k-j+1)))
                {
                    final_length=p[0];
                    starting_col=j;
                    ending_col=k;
                    starting_row=p[1]-p[0]+1;
                    ending_row=p[1];
                }
            }
        }
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=starting_row;i<=ending_row;++i)
        {
             ArrayList<Integer>list=new ArrayList<>();
            for(int j=starting_col;j<=ending_col;++j)
            {
               list.add(M[i][j]);
            }
 
            ans.add(list);
        }
        return ans;
    }
}
        
