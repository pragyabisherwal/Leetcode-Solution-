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
        int carry=0;
        
        ListNode ansHead = null;
        ListNode ansTail = null;
        
        
        while(l1!=null || l2!=null || carry!=0)
        {
            ListNode temp=null;
            
            int val1=0;
            if(l1!=null)
                val1=l1.val;
            
           
            int val2=0;
            if(l2!=null)
                val2=l2.val;
            
            int sum = val1+ val2+carry;
 
            int digit=sum%10;
            // System.out.println(digit);
            
            if(ansHead==null)
            {
                temp = new ListNode(digit);
                ansHead=temp;
                ansTail=temp;
            }
            
            else
               {  
                temp = new ListNode(digit);
                ansTail.next=temp;
                ansTail=ansTail.next;
               }
            
            carry=sum/10;  
            
            if(l1!=null)
                l1=l1.next;
            
             if(l2!=null)
                l2=l2.next;
      
        }
        
   
       return ansHead; 
    }
}