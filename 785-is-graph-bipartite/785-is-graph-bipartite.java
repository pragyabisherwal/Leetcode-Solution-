class Solution {
    
    public class pair{
        int vtx;
        int clr;
        
        pair(){}
        
        pair(int vtx ,int clr){
            this.vtx = vtx;
            this.clr=clr;
        }
    }
    public boolean isBipartite(int[][] graph) 
    {
        int [] vis = new int[graph.length];
        Arrays.fill(vis,-1);
        
        
        for(int v=0 ; v<graph.length ; v++)
        {
            if(vis[v]==-1)
            {
                    Queue<pair> qu = new LinkedList<> ();
                    //SEEDING
                    qu.add(new pair(v , 0));

                    while(qu.size()!=0)
                    {
                        int size = qu.size();

                        while(size-- > 0)
                        {
                            pair rem = qu.remove();


                            if(vis[rem.vtx]!=-1)
                            {
                                if(vis[rem.vtx]==rem.clr)
                                {
                                    continue;
                                }

                                else
                                {
                                    return false;
                                }
                            }

                            vis[rem.vtx]=rem.clr;

                            for(int e : graph[rem.vtx])
                            {
                                if(vis[e]==-1)
                                {
                                    qu.add(new pair(e,1-rem.clr));
                                }
                            }
                        }

                    }

                }
        
    }
      return true;
        
    }
}