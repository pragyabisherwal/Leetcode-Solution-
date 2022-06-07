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
    
    private int result = 0;
    
    public void leavesSum(TreeNode root , boolean isLeft)
    {
        if(root==null)
            return ;
        
        if(isLeft == true && root.left==null && root.right==null)
        {
            result+=root.val;
            return;
        } 
        
        leavesSum(root.left , true);
        leavesSum(root.right , false);
        
    
    }
    
    public int sumOfLeftLeaves(TreeNode root) 
    {
        leavesSum(root , false);
        return result;
    }
}