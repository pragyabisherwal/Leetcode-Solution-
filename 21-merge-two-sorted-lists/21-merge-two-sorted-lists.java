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
   
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode p=list1;
        ListNode q=list2;
        
        ListNode result = new ListNode();
        ListNode curr = result;
        
        while(p!=null && q!=null)
        {
           if(p.val<q.val)
           {
              curr.next=p;
               p=p.next;
               
           }
            
            else 
            {
              curr.next=q;
               q=q.next;

            }
            
            curr=curr.next;
   
        }
        
        if(p!=null)
        {
            curr.next=p;
           
        }
        
        if(q!=null)
        {
            curr.next=q;
        }
        
        return result.next;
        
        
    }
}