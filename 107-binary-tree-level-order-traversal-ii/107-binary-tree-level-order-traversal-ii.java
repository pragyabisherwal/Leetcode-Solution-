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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList <> ();
            
        if(root==null)
            return result;
        
        Stack <List <Integer>> st = new Stack ();
        Queue <TreeNode> qu = new LinkedList();
        qu.add(root);
    
        while(qu.size()!=0)
        {
            List <Integer> level = new ArrayList<> ();
            int count = qu.size();
            
            for(int i=0 ; i<count ; i++)
            {
                TreeNode rem = qu.remove();
                level.add(rem.val);
                
                if(rem.left!=null)
                    qu.add(rem.left);
                
                if(rem.right!=null)
                    qu.add(rem.right);
                     
            }
            
            st.add(level);
        }
        
        while(st.size()!=0)
        {
            result.add(st.pop());
        }
        
        return result;
        
    }
}