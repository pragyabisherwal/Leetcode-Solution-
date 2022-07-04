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
   
    public int position(int[] inorder ,  int ele , int start , int end)
    {
        for(int i=start; i<=end; i++)
        {
            if(inorder[i]==ele)
                return i;
        }
        
        return -1;
    }
    
    int idx;
    
    public TreeNode solve(int[] inorder, int[] postorder, int start , int end , int n)
    {
        if(idx<0 || start>end)
            return null;
        
        int ele = postorder[idx];
        idx = idx-1;
        TreeNode root = new TreeNode(ele);
        int pos = position(inorder , ele , start , end );
        
        root.right = solve(inorder , postorder ,pos+1,end, n);
        root.left = solve(inorder , postorder ,start,pos-1 , n);
        
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        int n = inorder.length;
        idx=n-1;
       
        TreeNode result = solve(inorder , postorder, 0 ,n-1 , n);
        return result;
    }
}