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
     int min = -1;
     int secondMin = Integer.MAX_VALUE;
     boolean flag = false;
     
    public void helper(TreeNode root) 
    {
       if(root==null)
           return;
        
      if(min<root.val && root.val<=secondMin)
      {
          secondMin=root.val;
          flag=true;
      }
        
        helper(root.left);
        helper(root.right);
    }
        
    public int findSecondMinimumValue(TreeNode root) 
    {
       if(root == null)
           return secondMin;
        
       min = root.val;
       helper(root);
       if(flag==false)
           return -1;
        return secondMin;
    }
}