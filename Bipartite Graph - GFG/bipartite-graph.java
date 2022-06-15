// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    public class pair
    {
        int v;
        int color;
        
        pair(){}
        
        pair(int v , int color)
        {
            this.v=v;
            this.color=color;
        }
    }
    
    public boolean traverse(int v , ArrayList<ArrayList<Integer>>adj , int [] vis)
    {
        Queue<pair> qu = new LinkedList<> ();
        qu.add(new pair(v , 1));
        
        while(qu.size()>0)
        {
            pair rem = qu.remove();
            
            if(vis[rem.v]!=0)
            {
                int oc=vis[rem.v];
                int nc=rem.color;
                
                if(oc!=nc)
                 return false;
            }
            
            vis[rem.v]=rem.color;
            
            for(int nbr : adj.get(rem.v))
            {
                if(vis[nbr]==0)
                {
                    qu.add(new pair(nbr , rem.color*-1));
                }
            }
        }
        
        
        return true;
        
        
    }
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int [] vis =new int[V];
  
        for(int v=0 ;  v<V ; v++)
        {
            if(vis[v]==0)
            {
                boolean isBip=traverse(v , adj , vis);
                
                if(isBip==false)
                 return false;
                
            }
        }
        
        return true;
        
    }
}