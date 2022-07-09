// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
       Stack <Integer> st = new Stack<> ();
       boolean [] vis1 = new boolean[V];
       
       for(int v=0 ; v<V ; v++)
       {
           if(vis1[v]==false)
            dfs1(v , adj , vis1 , st);
       }
       
       //TRANSPOSE
        ArrayList<ArrayList<Integer>> transpose = new  ArrayList<>();
        
        for(int v=0 ; v<V ; v++)
        {
            transpose.add(new ArrayList<>());
        }
       
       for(int v=0 ; v<V ; v++)
        {
          for(int nbr : adj.get(v))
          {
              transpose.get(nbr).add(v);
          }
        }
        
      boolean [] vis2 = new boolean[V];
      int count=0;
       
       while(st.size()>0)
       {
           int v = st.pop();
           
           if(vis2[v]==false)
         {
             dfs2(v ,  transpose , vis2);
             count++;
         }
       }  
       
       return count;
    }
    
    public void dfs2(int src, ArrayList<ArrayList<Integer>> transpose , boolean [] vis2)
    {
        vis2[src]=true;
        
        for(int nbr : transpose.get(src))
        {
           if(vis2[nbr]==false)
            dfs2(nbr , transpose, vis2); 
        }
        
        
    }
    
    public void dfs1(int src, ArrayList<ArrayList<Integer>> adj , boolean [] vis1 ,  Stack <Integer> st)
    {
        vis1[src]=true;
        
        for(int nbr : adj.get(src))
        {
           if(vis1[nbr]==false)
            dfs1(nbr , adj , vis1 , st); 
        }
        
        st.push(src);
    }

}
