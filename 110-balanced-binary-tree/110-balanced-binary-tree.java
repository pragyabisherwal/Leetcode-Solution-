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
    
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int lt = height(root.left);
        int rt = height(root.right);
        
        int bf=Math.abs(lt-rt);
        
        if(bf>1 || lt==-1 ||rt==-1)
            return -1;
        
        else
        return Math.max(lt , rt) +1;  
        
    }
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
            return true;
        
        int ht = height(root);
        
        if(ht!=-1)
            return true;
        
        else 
            return false;
       
        
        
    }
}