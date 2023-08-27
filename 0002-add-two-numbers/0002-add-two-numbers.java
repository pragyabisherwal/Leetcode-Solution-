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
        ListNode temp = result;
        int carry=0;
        
        while(l1!=null || l2!=null || carry!=0)
        {
            int num1=0 , num2=0;
            
            if(l1!=null)
              num1 = l1.val;
            
            if(l2!=null)
              num2 = l2.val;
            
            int sum = num1 + num2 + carry;
            
            int digit = sum%10;
            carry = sum/10;
            
            ListNode ans = new ListNode(digit);
            temp.next=ans;
            
            if(l1!=null)
             l1=l1.next;
            
            if(l2!=null)
             l2=l2.next;
            
            temp=temp.next;
        }
        
        return result.next;
    }
}