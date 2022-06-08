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
     public boolean symmetricHelper(TreeNode left , TreeNode right) 
    {
         if(left==null && right==null)
             return true;
         
         else if(left==null && right!=null || left!=null && right==null)
             return false;
         
         if(left.val != right.val)
             return false;
         
         boolean leftAns=symmetricHelper(left.left , right.right);
         boolean rightAns=symmetricHelper(left.right , right.left);
         
         boolean ans = leftAns&&rightAns;
         
         return ans;
         
     }
    
    public boolean isSymmetric(TreeNode root) 
    {
        if(root==null)
            return false;
        
        boolean result=symmetricHelper(root.left , root.right);
        return result;
        
    }
}