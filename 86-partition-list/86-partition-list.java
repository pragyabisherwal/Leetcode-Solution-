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
    public ListNode partition(ListNode head, int x) 
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode lesserTail = null, lesserHead = null;
        ListNode greaterHead = null, greaterTail = null;
        ListNode itr = head;
        
        while(itr != null) {
            if(itr.val < x) {
                if(lesserHead == null) {
                    lesserHead = new ListNode(itr.val);
                    lesserTail = lesserHead;
                } else {
                    lesserTail.next = new ListNode(itr.val);
                    lesserTail = lesserTail.next;
                }
            } else {
                if(greaterHead == null) {
                    greaterHead = new ListNode(itr.val);
                    greaterTail = greaterHead;
                } else {
                    greaterTail.next = new ListNode(itr.val);
                    greaterTail = greaterTail.next;
                }
            }
            
            itr = itr.next;
        }

        
        if(lesserTail == null)
            return greaterHead;

        lesserTail.next = greaterHead;
        return lesserHead;
    }
}