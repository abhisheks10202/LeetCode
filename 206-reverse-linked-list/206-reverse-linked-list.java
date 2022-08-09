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
    public ListNode reverseList(ListNode head) {
        
      ListNode previous=null;
        ListNode temp=null;
        ListNode current=head;
         while(current!=null)
         {
             temp=current;
             current=current.next;
             temp.next=previous;
             previous=temp;
             // previous=previous.next;
         }
        head=previous;
        return head;
}
}