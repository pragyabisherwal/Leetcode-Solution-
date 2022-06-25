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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode check = head;
        int len=0;
        
        while(check!=null)
        {
            len++;
            check=check.next;   
        }
        
        if(len==1)
            return null;
        
        if(len-n==0)
            return head.next;
        
        
        ListNode curr = head;
        int count=1;
        
        while(count!=len-n)
        {
            curr=curr.next;
            count++;
        }
        
        ListNode temp=curr.next.next;
        curr.next=temp;
        
        return head;
    }
}