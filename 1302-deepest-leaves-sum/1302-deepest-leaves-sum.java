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
    
    private int result=0;
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        int ans = Math.max(left , right) + 1;
        
        return ans;
    }
    public void leavesSum(TreeNode root , int ht)
    {
        if(root==null)
            return ;
        
        if( ht==1 && root.left==null && root.right==null)
        {
           result+=root.val;
        }
        
        
       leavesSum(root.left , ht-1);
       leavesSum(root.right , ht-1);
    
    }
    
    public int deepestLeavesSum(TreeNode root) 
    {
        int ht =height(root);
        
        
        leavesSum(root , ht);
        return result;
    }
}