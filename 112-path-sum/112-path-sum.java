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
    
    public boolean check(TreeNode root, int targetSum , int sum)
    {
        
        if(sum+root.val==targetSum && root.left==null && root.right==null )
            return true;
        
        boolean left=false;
        boolean right=false;
        
        if(root.left!=null)
             left=check(root.left , targetSum , sum+root.val); 
        
        if(root.right!=null)
            right=check(root.right , targetSum , sum+root.val); 
        
        return left||right;
            
    }
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        if(root==null)
            return false;
        
        boolean ans=check(root , targetSum , 0); 
        return ans;
        
    }
}