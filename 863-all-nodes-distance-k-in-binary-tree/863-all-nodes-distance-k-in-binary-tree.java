/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public  ArrayList<TreeNode>node2Root(TreeNode node ,int x)
  {
    if(node == null)
    {
      ArrayList<TreeNode>base = new ArrayList<>();
      return base;
    }

    if(node.val==x)
    {
      ArrayList<TreeNode>myAns = new ArrayList<>();
      myAns.add(node);
      return myAns;
    }

    ArrayList<TreeNode>left=node2Root(node.left,x);
    if(left.size()>0)
    {
      left.add(node);
       return left;
    }

    ArrayList<TreeNode>right=node2Root(node.right,x);
    if(right.size()>0)
    {
      right.add(node);
       return right;
    }

    return new ArrayList<TreeNode>();

  }

  public void kNodesAway(TreeNode node,int k,TreeNode blocker , ArrayList <Integer> result) 
  {
    if(k<0 || node==null || node==blocker )
    {
       return;
    }

    if(k==0)
    {
      result.add(node.val);
    }


    kNodesAway(node.left ,k-1 , blocker , result);
    kNodesAway(node.right ,k-1, blocker , result);
    
  }

  
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        ArrayList <TreeNode>ans = node2Root(root ,target.val);
        TreeNode blocker = null;
        ArrayList <Integer> result = new ArrayList<> ();

        for(int i=0  ; i<ans.size(); i++)
        {
          TreeNode temp = ans.get(i);
          kNodesAway(temp , k-i , blocker , result);
          blocker=temp;
       }
        
        return result;
        
    }

        
    
}