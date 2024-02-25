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
    public ListNode mergeKLists(ListNode[] lists) {
        
         if(lists == null)
           return null;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode head : lists)
        {   //Adding all the nodes inside the list inside the priority queue.
            while(head != null)
            {           
                pq.add(head.val);          
                head = head.next;           
            }
        }
        
        //Creating a new node on which we will attach our all the other nodes which will remove from pq
        LinkedList<Integer> l = new LinkedList<>();     
        ListNode head = new ListNode(0);               
        ListNode ptr = head;   
        
        //Attaching the elements along the new list 'l'
        
         while(!pq.isEmpty())
         {                           
            ListNode newNode = new ListNode(pq.remove() , null);  
             
            ptr.next = newNode;     // Attaching the prev and newly made node                       
            ptr = newNode;        //   Now making the new node as ptr as the next node will attach next to it                     
          }
    
      return head.next;
    }
}