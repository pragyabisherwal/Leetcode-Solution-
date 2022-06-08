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
    private String ans = "" ;
    
    public void helper (TreeNode root)
    {
        if(root==null)
            return;
        
         ans+=root.val;
        
        if(root.left==null && root.right==null)
            return;
     
        
            ans+="(";
            helper(root.left);
             ans+=")";
            
        
        
          if(root.right!=null)
        {
            ans+="(";
            helper(root.right);
             ans+=")";
            
        }
        
    }
    public String tree2str(TreeNode root) 
    {
       if(root==null)
           return ans;
        
        helper(root);
        return ans;
    }
}