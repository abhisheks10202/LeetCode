// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
     int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int max=-100;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[2]-a[2] );
      for(Job job:arr)
      {
          pq.add(new int[]{job.id,job.deadline,job.profit});
          max=Math.max(max,job.deadline);
      }
    
      int a[]=new int[max+1];
        //  System.out.println(max);
      Arrays.fill(a,-1);
      int k=0;
    int sum=0;
      while(!pq.isEmpty())
      {
        //   System.out.println(pq.peek()[1]+" "+pq.peek()[2]);
          int p[]=pq.remove();
          int j=p[1];
          while(j>0)
              {
                  if(a[j]==-1){
                  a[j]=p[2];
                  sum+=a[j];
                   k++;
                   break;
                 }
                 j--;
              }
      }
     return (new int[]{k,sum});
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/