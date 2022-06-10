/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean n1flag;
    private boolean n2flag;
    
    
    public TreeNode helper(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root==null)
            return null;
        
        
       TreeNode leftAns= helper(root.left , p , q);
       TreeNode rightAns= helper(root.right , p , q);
        
       if(root.val==p.val)
       {
           n1flag=true;
           return p;
       }
        
       else if(root.val==q.val)
       {
           n2flag=true;
           return q;
       }
        
      else if(leftAns!=null && rightAns!=null)
            return root;
        
      else if(leftAns!=null)
          return leftAns;
        
      else 
          return rightAns;
        
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root==null)
            return null;
        
        n1flag=false;
        n2flag=false;
        
        TreeNode lca=helper(root , p , q);
        
        if(n1flag==true && n2flag==true)
        {
            return lca;
        }
        
        else
            return null;
    }
}