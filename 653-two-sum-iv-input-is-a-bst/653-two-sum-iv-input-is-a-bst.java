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
    public boolean find(TreeNode root , int data)
    {
        if(root==null)
            return false;
        
        if(root.val > data)
            return find(root.left , data);
        
        else if(root.val < data)
            return find(root.right,data);
        
        else
            return true;
   }
    
    boolean flag=false;
    public void targetSum(TreeNode root,TreeNode node,int k)
    {
         if(node==null)
            return;
        
        targetSum(root , node.left , k);
        
        int delta = k-node.val;
        
        if(node.val<delta)
        {
            if(find(root,delta))
                flag=true;
        }
        
        targetSum(root , node.right , k);
        
        
    }
    public boolean findTarget(TreeNode root, int k) 
    {
        if(root==null)
            return false;
        
        targetSum(root , root , k);
        
        if(flag)
        return true;
        
        return false;
        
    }
}