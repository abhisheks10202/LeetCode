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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // List<Integer>list=new ArrayList<>();
        int max =0;
        for(int val:nums)
        max=val>max?val:max;
        int arr[]=new int[max+1];
        for(int val:nums)
        arr[val]=1;

        ListNode prev=new ListNode(0);
        prev.next=head;
        ListNode curr=head;
        ListNode p=prev;

        while(curr!=null)
        {
            if(curr.val<=max&&arr[curr.val]==1)
            {
                p.next=curr.next;
                curr=p.next;

            }
            else
            {
                p=p.next;
                curr=p.next;
            }
        }
        return prev.next;
    }
}