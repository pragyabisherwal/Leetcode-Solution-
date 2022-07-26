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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode dummy = new ListNode(-1 , head);
      
        ListNode itr = dummy;
        ListNode itrPrev = null;
        
        //Keeping two pointer on prev and on to the left
        for(int i=0 ; i<left ; i++)
        {
           itrPrev=itr;
            itr=itr.next;
        }
        
        //Reversing of Linked List
        ListNode curr = itr;
        ListNode prev = itrPrev;
        
        for(int i=left ; i<=right ; i++)
        {
           ListNode forw = curr.next;
           curr.next=prev;
           prev=curr;
           curr=forw;
        }
        
        //Connecting the left to right to rest of the LL
        itrPrev.next=prev;
        itr.next=curr;
        
        return dummy.next;
        
    }
}