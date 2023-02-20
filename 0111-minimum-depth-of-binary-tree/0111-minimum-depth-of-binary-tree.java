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
    public int minDepth(TreeNode root) 
    {
        if(root==null)
         return 0;
         
        int lht=minDepth(root.left);
        int rht=minDepth(root.right);
        
        if(root.left==null || root.right==null)
            return Math.max(lht , rht)+1;
             
        else
         return Math.min(lht , rht)+1;
    }
}