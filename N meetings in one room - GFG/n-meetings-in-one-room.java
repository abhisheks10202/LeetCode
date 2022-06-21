// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
      PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1] );
      for(int i=0;i<start.length;i++)
      {
          pq.add(new int[]{start[i],end[i]});
      }
      Stack<int[]>st=new Stack<>();
      int ar[]=pq.remove();
      st.push(new int[]{ar[0],ar[1]});
    //   System.out.println(st.peek()[0]);
      while(!pq.isEmpty())
      {
          int arr[]=pq.remove();
          int a[]=st.peek();
          if(st.peek()[1]<arr[0])
          {
            //   count++;
              st.push(new int[]{arr[0],arr[1]});
          }
      }
      return st.size();
    }
}
