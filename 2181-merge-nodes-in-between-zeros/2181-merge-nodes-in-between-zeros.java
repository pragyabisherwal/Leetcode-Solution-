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

    public ListNode mergeNodes(ListNode head) 
    {
        ListNode newHead = head;
        ListNode  curr = head;
      
        while(curr.next!=null)
        {
            int cnt=0;
            ListNode first = curr.next;
            
           while(first.val != 0)
           {
              cnt +=first.val;
              first=first.next;
           }
            
            first.val = cnt;
         
            curr.next=first;
            
            curr = first;
        }
        
        return newHead.next;

    }
}