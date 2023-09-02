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
    
    public boolean find(TreeNode node, int k)
    {
        if(node==null)
            return false;
        
        if(node.val>k)
          return find(node.left,k);
        
        else if(node.val<k)
           return find(node.right,k);

        else
            return true;
        
    }
    
    boolean flag = false;
    public void target(TreeNode root ,TreeNode node, int k)
    {
        if(node==null)
            return;
        
        target(root , node.left,k);

        int delta = k-node.val;
        
        if(node.val<delta)
        {
            if(find(root , delta))
            flag = true;
        }
        
        target(root , node.right,k);
        
    }
    public boolean findTarget(TreeNode root, int k) 
    {
        if(root==null)
            return false;
        target(root ,root , k);
        
        if(flag)
            return true;
        
      
        return false;
        
    }
}