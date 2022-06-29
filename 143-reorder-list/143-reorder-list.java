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
    public ListNode mid(ListNode head)
    {
        ListNode slow =head;
        ListNode fast= head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head) 
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode curr = head;
        ListNode forw = null;
        ListNode prev = null;
        
        while(curr!=null)
        {
            forw = curr.next;
            curr.next=prev;
           
            prev = curr;
            curr=forw;
        }
        
        return prev;
        
    }
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null)
            return ;
        ListNode mid = mid (head);
        ListNode nhead=mid.next;
        mid.next=null;
        
         nhead=reverse(nhead);
        
            ListNode c1 = head;
            ListNode c2 = nhead;
            ListNode f1=null;
            ListNode f2 = null;
        
        while(c1!=null && c2!=null)
        {
            f1 = c1.next;
            f2 = c2.next;
            
            c1.next=c2;
            c2.next=f1;
            
            c1=f1;
            c2=f2;
        }
            
        
    }
}