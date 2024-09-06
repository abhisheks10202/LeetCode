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
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums)
        hm.put(val,0);

        ListNode prev=new ListNode(0);
        prev.next=head;
        ListNode curr=head;
        ListNode p=prev;

        while(curr!=null)
        {
            if(hm.containsKey(curr.val))
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