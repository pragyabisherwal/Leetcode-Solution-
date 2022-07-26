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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public ListNode middleNode(ListNode head) 
    {
        if(head.next==null)
            return head;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null )
        {
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        
        prev.next=null;
        return slow;
        
    }
    
    public TreeNode sortedListToBST(ListNode head) 
    {
        if(head==null)
            return null;
        
        ListNode mid = middleNode(head);
        
        if(mid == head) 
            head = null;
        
        TreeNode myTree = new TreeNode(mid.val);
        myTree.left =sortedListToBST(head);
        myTree.right=sortedListToBST(mid.next);
        
        return myTree;
    }
}