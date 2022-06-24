// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String A = read.readLine().trim();
            
            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    public String replace(String str,char ch1,char ch2)
    {
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch==ch1){
                sb.setCharAt(i,ch2);
            }
            else if(ch==ch2)
            {
                sb.setCharAt(i,ch1);
            }
        }
        return sb.toString();
    }
    
    String chooseandswap(String A){
           int freq[] = new int[26];
       for(int i=0;i<A.length();i++){
           freq[A.charAt(i)-'a']++;
       }
       
       for(int i=0;i<A.length();i++)
       {
           char ch=A.charAt(i);
           for(int j=0;j<ch-'a';j++)
           {
               if(freq[j]!=0)
               {
                   return replace(A,ch,(char)('a'+j));
               }
           }
           freq[ch-'a']=0;
       }
       return A;
    }
    
}