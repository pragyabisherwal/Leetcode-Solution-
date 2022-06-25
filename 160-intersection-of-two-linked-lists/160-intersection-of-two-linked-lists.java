/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int length(ListNode head)
    {
        ListNode temp = head;
        int len =0;
        
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode p=headA;
        ListNode q=headB;
        
        int lenA = length(headA);
        int lenB= length(headB);
        
        int delta = Math.abs(lenA-lenB);
        
        if(lenA > lenB)
        {
            for(int d=0 ; d<delta ; d++)
            {
                p=p.next;
            }
        }
        
        else if(lenA < lenB)
        {
            for(int d=0 ; d<delta ; d++)
            {
                q=q.next;
            }
        }
        
        while(p!=q)
        {
            p=p.next;
            q=q.next;
        }
        
        
        return p;
        
        
        
        
    }
}