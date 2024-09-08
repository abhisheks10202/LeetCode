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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        int rem=len%k;
        int equal=len/k;
        ListNode[]ans=new ListNode[k];
        curr=head;
        ListNode prev=head;
        
        for(int i=0;i<k;i++)
        {
            int currSize=equal;
            ListNode data=curr;
            if(rem>0)
            {
                rem--;
                currSize++;
            }
            while(currSize>0)
            {
                prev=curr;
                curr=curr.next;
                currSize--;
            }
             if (prev != null) {
                prev.next = null;
            }
            ans[i]=data;
        }
        return ans;
       

    }
}