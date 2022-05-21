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
   
    List <List<Integer>> result ;
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
       result= new ArrayList<> ();
        
      if(root==null)
          return result;
        
       Queue<TreeNode> qu = new LinkedList();
       qu.add(root);
       
 
       while(qu.size()>0)
       {
           List<Integer>level= new ArrayList<> ();
           int count = qu.size();
           
           
           for(int i=0 ; i<count ; i++)
           {
              TreeNode temp = qu.poll();
              level.add(temp.val);
               
               if(temp.left!=null)
               {
                   qu.add(temp.left);
               }
               
               if(temp.right!=null)
               {
                   qu.add(temp.right);
               }  
           }
           
           result.add(level);
             
          }

        return result;
        
        
    }
}