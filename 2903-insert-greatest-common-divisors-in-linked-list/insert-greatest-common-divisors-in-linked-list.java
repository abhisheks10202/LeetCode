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
    public int gcd(int a,int b)
    {
            if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode prev=head;
        ListNode curr=prev.next;

        while(curr!=null)
        {
            int gcd=gcd(prev.val,curr.val);
            ListNode gc=new ListNode(gcd);
            prev.next=gc;
            gc.next=curr;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}