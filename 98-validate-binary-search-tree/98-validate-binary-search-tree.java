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
     long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) 
    {
        //Inorder Traversal Of a BST is sorted.
        if(root==null)
            return true;
     
        //Left call
        boolean leftAns=isValidBST(root.left);
        if(leftAns==false)
             return false;
        
        //Inorder we will check that it should not be greater than the prev one because 
        //than it will not be sorted and hence do not satisy the condition of BST and 
        //return false else just update the prev value with the current one
        
        if(prev >= root.val)
            return false;
        prev=root.val;
        
        
         boolean rightAns=isValidBST(root.right);
         if(rightAns==false)
             return false;
        
        return true;
        
        
        
    }
}