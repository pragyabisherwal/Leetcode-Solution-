/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node helper(Node node , HashMap<Integer,Node> vis)
    {
        Node cloned = new Node(node.val);
        vis.put(node.val,cloned);
        
        for(Node nbr : node.neighbors)
        {
            if(vis.containsKey(nbr.val)==false)
            {
                Node nbrClone = helper(nbr, vis);
                cloned.neighbors.add(nbrClone);
            }
            
            else if(vis.containsKey(nbr.val)==true)
            {
                Node nbrClone = vis.get(nbr.val);
                cloned.neighbors.add(nbrClone);  
            }
        }
        
        return cloned;
    }
    public Node cloneGraph(Node node) 
    {
        if(node == null)
            return null;
        HashMap<Integer,Node> vis= new HashMap<> ();
        
        return helper(node,vis);
        
    }
}