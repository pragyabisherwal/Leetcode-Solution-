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
            return -1 ;
        
        int lt =height(root.left);
        int rt =height(root.right);
        
        int myHt=Math.max(lt , rt)+1;
        
        return myHt;
        
        
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)
            return 0;
        
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        int myD=lh+rh+2;
        
        int ans = Math.max(myD , Math.max(ld , rd));
        
        return ans;
    }
}