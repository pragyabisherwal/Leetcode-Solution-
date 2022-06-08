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
    private int sum=0;
    
    public void helper(TreeNode root , int val)
    {
        if(root==null)
            return;
        
        helper(root.left ,10*val+root.val);
        helper(root.right ,10*val+root.val);
        
        
        if(root.left==null && root.right==null)
            sum+=10*val+root.val;
    }
    public int sumNumbers(TreeNode root) 
    {
        helper(root , 0);
        return sum;
        
    }
}