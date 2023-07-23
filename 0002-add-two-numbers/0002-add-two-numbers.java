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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head = null;
        ListNode tail = null;
        int carry=0;
       
        
        while(l1!= null || l2!= null || carry!=0)
        {
            int val1=0;
            if(l1!=null)
                val1=l1.val;
            
            int val2=0;
            if(l2!=null)
                val2 = l2.val;
            
            int sum = val1 +  val2 + carry;
            int digit = sum%10;
            carry = sum/10;
            
            ListNode temp = new ListNode(digit);
            
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            
            else
            {
                tail.next=temp;
                tail=temp;
            }
          
            if(l1!=null)
              l1=l1.next;
           
            if(l2!=null)
              l2=l2.next;
                
        }
        
        return head;
    }
}