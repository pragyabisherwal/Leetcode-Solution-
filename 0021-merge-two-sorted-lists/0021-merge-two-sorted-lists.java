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
        ListNode mergeList = new ListNode();
        ListNode result = mergeList;
        
        ListNode p= list1;
        ListNode q= list2;
        
        while(p!=null && q!=null)
        {
            if(p.val<=q.val)
            {
               mergeList.next=p;
               p=p.next;
            }
            
            else if(p.val>q.val)
            {
               mergeList.next=q;
               q=q.next;
            }
            mergeList=mergeList.next;
        }
        
        if(p!=null)
        {
            mergeList.next=p;
        }
        
        else if(q!=null)
        {   
            mergeList.next=q;
        }
            
        return result.next;
        
    }
}