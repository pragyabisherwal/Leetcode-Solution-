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
    public void reverse(ListNode head , ListNode end)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = head.next;

        while(prev!=end)
        {
           curr.next=prev;
            
           prev=curr;
           curr=forw;
            
            if(forw!=null)
                 forw=forw.next;

        }
   
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head==null || head.next==null || k==1)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        
        ListNode before=dummy;
        ListNode end=head;
        int i=0;  // Keeping the count of number of nodes
        
        while(end!=null)
        {
            i++;
            
            if(i%k==0)
            {
                ListNode after = end.next;
                ListNode start = before.next;
 
                reverse(start , end);
      
                before.next=end;
                start.next=after;
                
                before=start;
                end=after;    
            }
            
            else
            {
                end=end.next;
            }
            
            
        }
        
        return dummy.next; 
        
    }
}