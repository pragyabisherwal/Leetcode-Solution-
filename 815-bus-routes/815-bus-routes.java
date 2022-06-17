class Solution {
    public class pair{
        int bus;
        int csf;
        
        pair(){}
        
        pair(int bus , int csf)
        {
            this.bus=bus;
            this.csf=csf;
        }
    }
    public int numBusesToDestination(int[][] routes, int source, int target) 
    {
        if(source==target)
            return 0;
        
        HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
        
        //CREATING A HASHMAP OF ALL THE BUSES THAT COME ON VERY STOP
        for(int bus=0 ; bus<routes.length ; bus++)
        {
            for(int stop : routes[bus])
            {
                if(map.containsKey(stop)==false)
                {
                    map.put(stop , new HashSet<> ());
                }
                
                map.get(stop).add(bus);
            }
            
        }
        
        //ADDING ALL THE BUSES FROM THE STOP INSIDE THE QUEUE
        Queue <pair> qu = new LinkedList ();
        
        for(int bsrc : map.get(source))
        {
            qu.add(new pair(bsrc , 1));
        }
        
        //APPLYING BFS ON TO THE GRID
        
        boolean [] vis = new boolean [routes.length];
        
        while(qu.size()>0)
        {
            pair rem = qu.remove();
            
            if(vis[rem.bus])
                continue;
            
            vis[rem.bus]=true;
            
            for(int stop : routes[rem.bus])
            {
                if(stop==target)
                     return rem.csf;
            }
            
            for(int stop:routes[rem.bus])
            {
                for(int bus : map.get(stop))
                {
                    if(!vis[bus])
                    {
                        qu.add(new pair(bus , rem.csf+1));
                    }
                }
            }
  
        }
        
        return -1;
        
        
    }
}