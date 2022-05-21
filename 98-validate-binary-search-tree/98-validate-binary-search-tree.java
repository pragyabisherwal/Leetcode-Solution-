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
     long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) 
    {
        if(root==null)
            return true;
     
        boolean leftAns=isValidBST(root.left);
        if(leftAns==false)
             return false;
        
        if(prev >= root.val)
            return false;
        prev=root.val;
        
        
         boolean rightAns=isValidBST(root.right);
         if(rightAns==false)
             return false;
        
        return true;
        
        
        
    }
}