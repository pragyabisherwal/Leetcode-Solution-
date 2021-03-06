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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List <Integer> li = new ArrayList<> ();
        if(root==null)
            return li;
        
        Queue<TreeNode> qu = new LinkedList ();
        qu.add(root);
        
       
        
        
        while(qu.size()!=0)
        {
            int level = qu.size();
            
            for(int i=0 ; i<level ; i++)
            {
                TreeNode rem = qu.remove();
                
                if(i==level-1)
                    li.add(rem.val);
                
                if(rem.left!=null)
                    qu.add(rem.left);
                
                if(rem.right!=null)
                    qu.add(rem.right);
            }
        }
        
        return li;
        
    }
}