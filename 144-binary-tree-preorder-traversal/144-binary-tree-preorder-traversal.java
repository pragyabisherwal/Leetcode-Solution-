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
    
    public void preOrder(TreeNode root , List<Integer>myList)
    {
        if(root==null)
        {
            return;
        }
        
        myList.add(root.val);
        preOrder(root.left , myList);
        preOrder(root.right , myList);
            
    }
    
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        ArrayList <Integer>result = new ArrayList<> ();
        
        preOrder(root,result);
        return result;
          
    }
}