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
    
    public int max(TreeNode node){
        TreeNode curr = node;
        
        while(curr.right != null)
            curr =curr.right;
        
        return curr.val;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null)
                return null;

            if(root.val<key)
                root.right = deleteNode(root.right , key);

            else if(root.val>key)
                root.left = deleteNode(root.left , key);

            else
            {
                //CASE 0 child and 1 child

                if(root.left==null || root.right==null)
                    return root.left!=null?root.left:root.right;
                
                     //CASE 2 child
                    int maxEle = max(root.left); // we can also do min of right
                    root.val = maxEle;
                    root.left = deleteNode(root.left,maxEle);
  
            }
        
        return root;
            
        }
            
            
        
    }
