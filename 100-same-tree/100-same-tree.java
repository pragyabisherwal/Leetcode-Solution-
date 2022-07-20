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
    public boolean helper(TreeNode p, TreeNode q)
    {
        boolean ans = false;
        
        if(p==null && q==null)
        {
            ans=true;
            return ans;
        }
        
        if(p==null && q!=null || p!=null && q==null)
        {
            return ans;
        }
        
        if(p.val!=q.val)
        {
            return ans;
        }
            
        boolean left=helper(p.left , q.left);
        boolean right=helper(p.right , q.right);
        
        ans = left&&right;
        
        return ans;
        
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        
        boolean result =helper(p,q);
        return result;
        
    }
}