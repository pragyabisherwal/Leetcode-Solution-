// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean [] vis,boolean [] dfsVis,int src)
    {
        vis[src]=true;
        dfsVis[src]=true;
        
        for(int nbr : adj.get(src))
        {
            if(!vis[nbr])
            {
                boolean cycle = dfs(adj , vis , dfsVis , nbr);
                if(cycle)
                 return true;
            }
            
            else if(dfsVis[nbr]==true)
            {
                return true;
            }
        }
        
        dfsVis[src]=false;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean [] vis = new boolean[V];
        boolean [] dfsVis = new boolean[V];
        
        for(int i=0 ; i<V ; i++)
        {
            if(!vis[i])
            {
                boolean cycle =dfs(adj , vis , dfsVis , i);
                if(cycle)
                 return true;
            }
        }
        
        return false;
    }
}