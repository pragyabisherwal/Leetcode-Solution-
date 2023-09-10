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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> al = new ArrayList<> ();
        if(root==null)
            return al;
        
        
        Stack <TreeNode> ms = new Stack<> ();
        ms.push(root);
        
        Stack <TreeNode> cs = new Stack<> ();
        int level=1;
        
        while(ms.size()!=0)
        {
            List<Integer> li = new ArrayList<>();
            int size=ms.size();
            
            for(int i=0 ; i<size ; i++)
            {
               TreeNode rem = ms.pop();
               li.add(rem.val);
            
                if(level%2==0)
                {
                    if(rem.right!=null)
                      {
                          cs.push(rem.right);
                      }  
                       if(rem.left!=null)
                       {
                           cs.push(rem.left);
                       }   
                } 
                
                else
                {
                     if(rem.left!=null)
                       {
                           cs.push(rem.left);
                       }
                      if(rem.right!=null)
                      {
                          cs.push(rem.right);
                      }  
                }
            }
            
            
                ms=cs;
                cs = new Stack ();
                level++;
                
            
            
            al.add(li);
            
        }
        
        return al;
        
    }
}