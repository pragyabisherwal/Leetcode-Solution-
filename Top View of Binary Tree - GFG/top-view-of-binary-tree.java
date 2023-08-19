//{ Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    public static class pair{
        Node node;
        int level;
        
        pair(Node node , int level)
        {
            this.node = node;
            this.level = level;
        }
    } 
    static ArrayList<Integer> topView(Node root)
    {
       ArrayList<Integer> al = new ArrayList<>();
       
       if(root==null)
       return al;
       
       Map<Integer , Integer> hm = new TreeMap<>();
       Queue<pair> qu = new LinkedList<>();
       
       pair First = new pair(root , 0);
       qu.add(First);
       
       while(qu.size()!=0)
       {
           pair rem = qu.remove();
           
           if(hm.containsKey(rem.level)==false)
           {
               hm.put(rem.level , rem.node.data);
           }
           
           if(rem.node.left != null)
           {
               pair second = new pair(rem.node.left , rem.level-1);
               qu.add(second);
           }
           
           if(rem.node.right != null)
           {
              pair third = new pair(rem.node.right , rem.level+1);
              qu.add(third); 
           }
           
       }
       
       for(Map.Entry<Integer , Integer> entry : hm.entrySet())
          al.add(entry.getValue());
          
        return al;
        
    }
}