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
    public class pair
    {
        long min;
        long max;
    }
    
    private long maxW=0;
    
    public  void helper(TreeNode root , int level , long idx ,HashMap<Integer , pair> hm)
    {
        if(root==null)
            return;
        
        helper(root.left , level+1 , 2*idx , hm);
        helper(root.right , level+1 , 2*idx+1 , hm);
        
        pair p=null;
        
        if(hm.containsKey(level))
        {
            p = hm.get(level);
            
            p.min= Math.min(p.min , idx);
            p.max=Math.max(p.max , idx);
            
        }
        
        else
        {
            p = new pair();
            p.min=idx;
            p.max=idx;
            
            hm.put(level , p);
        }
        
        long width = p.max - p.min +1;
        
        if(width>maxW)
            maxW=width;
        
    }
    public int widthOfBinaryTree(TreeNode root) 
    {
        HashMap<Integer , pair> hm = new HashMap<> ();
        helper(root , 1 , 1 , hm);   
        
        return (int)maxW;
    }
    

}