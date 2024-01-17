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
        ListNode result = new ListNode();
        ListNode curr = result;
        
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        
        while(p!=null || q!=null || carry!=0)
        {
            int val1=0;
            if(p!=null)
                val1=p.val;
            
            int val2=0;
            if(q!=null)
                val2=q.val;
            
            int sum = val1 + val2 + carry;
            int dig = sum % 10;
            //System.out.println(dig);
            
            ListNode temp = new ListNode(dig);
            curr.next = temp;
            curr = curr.next;
            
            carry = sum/10;
            
            if(p!=null)
                p=p.next;
        
            if(q!=null)
               q=q.next;

        }
        
        return result.next;
        
    }
}