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
    public boolean check(TreeNode root , TreeNode min , TreeNode max)
    {
        if(root==null)
            return true;
        
        if(max!=null && root.val>=max.val)
            return false;
        
        if(min!=null && root.val<=min.val)
            return false;
        
        boolean lft = check(root.left , min , root );
        boolean rgt = check(root.right , root , max );
        
        return lft&&rgt;
        
    }
    public boolean isValidBST(TreeNode root) 
    {
        if(root==null)
            return true;
        
         return check(root , null , null);
        
    }
}