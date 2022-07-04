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
    
    int idx=0;
    public TreeNode solve(int[] preorder, int[] inorder ,int start , int end , int n)
    {
        if(idx>=n || start>end)
            return null;
        
        int ele = preorder[idx++];
        TreeNode root = new TreeNode(ele);
        //Now we need to find its position in inorder traversal;
        int pos = position(inorder , ele , start , end);
        
        root.left = solve(preorder , inorder ,start, pos-1 , n );
         root.right = solve(preorder , inorder,pos+1, end, n );
        
        return root;
        
            
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        
        int n = preorder.length;
        
       TreeNode result = solve(preorder , inorder ,0 , n-1 , n );
        return result;
    }
}