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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head==null)
            return head;
        if(head.next==null || head.next.next==null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next; 
        ListNode evenHead = even;
        
        
        while(odd!=null && even!=null)
        {
            odd.next = even.next;
    
            if(odd.next==null)
                break;
            
            odd=even.next;
            even.next=odd.next;
            even=odd.next;
        }
        
        odd.next=evenHead;
        
        return head;
    }
}