class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations)
    {
        int range=startFuel;
        int idx=0;
        int stops=0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
        
        while(range<target)
        {
            while(idx<stations.length && stations[idx][0]<=range)
            {
                pq.add(stations[idx][1]);
                idx++;
            }
            
            if(range>=target)
                return stops;
            
            else if(pq.isEmpty())
                return -1;
            
            else
            {
                int fuel=pq.remove();
                range+=fuel;
                stops++;
            }
                
        }
        
        return stops;
    }
}