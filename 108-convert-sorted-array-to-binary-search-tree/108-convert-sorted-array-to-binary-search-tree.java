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
    public TreeNode createBST(int[]nums,int i , int j)
    {
        if(i>j)
        {
            return null;
        }
        
        int mid =(i+j)/2;
        TreeNode myAns = new TreeNode(nums[mid]);
        
        myAns.left = createBST(nums , i , mid-1);
        myAns.right= createBST(nums , mid+1 , j);
        
        return myAns;
        
        
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length==0)
            return null;
        
        int n = nums.length-1;
        TreeNode result=createBST(nums,0 , n);
        return result;
        
    }
}