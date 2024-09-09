/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=-1;
            }
        }
        int i=0;
        int j=0;
        ListNode curr=head;
        int direction=0;
        int dir=1;
        arr[0][0]=curr.val;
        curr=curr.next;
        while(curr!=null)
        {     if(dir==1)
                {
                    j++;
                }
                else if(dir==2)
                {
                    i++;
                }
                else if (dir==3)
                 {
                    j--;
                }
                else 
                 {
                    i--;
                }
            if(i<m&&j<n&&i>=0&&j>=0&&arr[i][j]==-1)
            {
                arr[i][j]=curr.val;
                curr=curr.next;
            }
            else
            {
                if(dir==1)
                {j--;dir=2;}
                else if(dir==2)
                {i--;dir=3;}
                else if (dir==3)
                {j++;dir=4;}
                else 
                {i++;dir=1;}
            }

        }
        return arr;

    }
}