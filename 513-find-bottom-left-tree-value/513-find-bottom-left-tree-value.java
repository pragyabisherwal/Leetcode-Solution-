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
    public int height (TreeNode root)
    {
        if(root==null)
            return 0;
        
        int lt = height(root.left);
        int rt=height(root.right);
        
        return Math.max(lt , rt) +1;
        
    }
    
    public int levelOrder(TreeNode root , int ht)
    {
        int ans = 0;
        int level=0;
        
        Queue<TreeNode> qu = new LinkedList();
        qu.add(root);
        
        while(qu.size()!=0)
        {
            int count = qu.size();
            
            for(int i=0 ; i<count ; i++)
            {
               TreeNode rem = qu.remove();
                
                if(i==0 && level==ht-1)
                {
                    ans=rem.val;
                  
                }  
                
                
               if(rem.left!=null)
                   qu.add(rem.left);
                
               if(rem.right!=null)
                   qu.add(rem.right);
                   
            }
            
            level++;
        }
        
        return ans;
    }
    public int findBottomLeftValue(TreeNode root) 
    {
        int ht = height(root);
        
        int result=levelOrder( root , ht);
        return result;
        
    }
}