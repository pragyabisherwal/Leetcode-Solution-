// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    
    public boolean cyclicGraph(int src ,boolean [] vis , ArrayList<ArrayList<Integer>> adj)
    {
        Queue<Integer> qu = new LinkedList <> ();
        qu.add(src);
        
        while(qu.size()!=0)
        {  
            int parent = qu.remove();
            
            if(vis[parent])  
            { 
               return true;
            }
            
            vis[parent]=true;
                
            for(int nbr : adj.get(parent))
            {
                if(vis[nbr]==false)
                    qu.add(nbr);
            }
        }
        
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean [] vis = new boolean [V];
        
        for(int i=0 ; i<V ; i++)
        {
            if(!vis[i])
            {
                if(cyclicGraph(i , vis , adj))
                   return true;
            }
        }
        
        return false;
    }
}