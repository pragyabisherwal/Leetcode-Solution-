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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> al = new ArrayList<>();
        
        if(root==null)
            return al;
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        
        while(qu.size()>0)
        {
            int lvl = qu.size();
            List<Integer> temp = new ArrayList<>();
            
            for(int i=0 ; i<lvl ; i++)
            {
                TreeNode rem = qu.remove();
                
                temp.add(rem.val);
                
                if(rem.left !=null)
                    qu.add(rem.left);
                
                if(rem.right !=null)
                    qu.add(rem.right);
                
            }
            
            al.add(temp);
        }
        
        return al;
    }
}