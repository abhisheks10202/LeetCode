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
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestNumber(S,D));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
   
    static String smallestNumber(int S, int D){
       
       if(D*9<S)return "-1";
       String ans="";
       for(int i=D-1;i>=0;i--)
       {
           if(S>9)
           {
               ans="9"+ans;
               S-=9;
           }
           else
           {
               if(i==0)
               {
                   ans=S+ans;
               }
               else
               {
                   ans=(S-1)+ans;
                   i--;
                   while(i>0)
                   {
                       ans="0"+ans;
                       i--;
                   }
                   ans=1+ans;
                   break;
               }
           }
       }
       return ans;
    }
}