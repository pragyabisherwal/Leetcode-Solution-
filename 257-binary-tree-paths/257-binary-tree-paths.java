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
class Solution 
{
    private List<String> result = new ArrayList<> ();
    
    public void helper(TreeNode root , String asf)
    {
        if(root.left==null && root.right==null)
        {
            asf+=root.val;
            result.add(asf);
            asf="";
            
            return;
        }
        
        if(root.left!=null)
            helper(root.left , asf+root.val+"->");
        
        if(root.right!=null)
            helper(root.right , asf+root.val+"->");
            
    }
    
    public List<String> binaryTreePaths(TreeNode root) 
    {
        helper(root , "");
        return result;
        
    }
}