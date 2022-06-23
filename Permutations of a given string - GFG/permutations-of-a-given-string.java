// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    List<String >list=new ArrayList<>();
    public void solve(String ip,String op,int index){
        if(index>=ip.length())
        {
            if(list.contains(ip)==false)
            list.add(ip);
            return;
        }
        // op=op+ip.substring(0,1);
        for(int j=index;j<ip.length();j++)
        {
            swap(index,j,ip);
            StringBuilder sb=new StringBuilder(ip);
            char ch=sb.charAt(index);
            sb.setCharAt(index,sb.charAt(j));
            sb.setCharAt(j,ch);
            ip=sb.toString();
            solve(ip,op,index+1);
            swap(j,index,ip);
            StringBuilder sb1=new StringBuilder(ip);
            char ch1=sb1.charAt(j);
            sb1.setCharAt(j,sb1.charAt(index));
            sb1.setCharAt(index,ch1);
            ip=sb1.toString();
        }
    }
    public void swap(int i,int j,String ip){
        
    }
    public List<String> find_permutation(String S) {
        // Code here
        solve(S,"",0);
        Collections.sort(list);
        return list;
    }
}