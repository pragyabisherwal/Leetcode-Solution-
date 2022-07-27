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
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode travel = head;
        int count=1;
       
        while(count!=k)
        {
           travel = travel.next;
           count++;
        }
        
        ListNode first=travel;
        ListNode check = first.next;
        ListNode second=head;
        
        while(check!=null)
        {
           check = check.next;
           second=second.next;
        }
        
        int temp = first.val;
        first.val=second.val;
        second.val=temp;
        
        
        
        return head;
        
    }
}