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
    public TreeNode creation(int[]nums , int i , int j)
    {
        if(i>j)
            return null;
        
        int mid = (i+j)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        TreeNode lft = creation(nums , i , mid-1);
        TreeNode rgt = creation(nums , mid+1 , j);
        
        node.left = lft;
        node.right = rgt;
        
        return node;
 
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length==0)
            return null;
        
        int n = nums.length-1;
        
        TreeNode ans = creation(nums , 0 , n);
        return ans;
        
        
    }
}