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
    public int[] nextLargerNodes(ListNode head) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int n=0;
        
        while(head!=null)
        {
            n++;
            al.add(head.val);
            head=head.next;
        }
        
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = al.size()-1 ; i>=0 ; i--)
        {
            while(st.size()>0 && st.peek()<=al.get(i))
                st.pop();
            
            if(st.size()==0)
                ans[i]=0;
            
            else
                ans[i]=st.peek();
            
            st.push(al.get(i));

            }
        
        return ans;
    }
}