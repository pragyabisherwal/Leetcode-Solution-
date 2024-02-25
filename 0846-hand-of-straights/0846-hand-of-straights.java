class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num : hand)
            pq.add(num);
        
        while(pq.size()>0)
        {
            int temp = pq.poll();
            
            for(int i=1 ; i<groupSize ; i++)
            {
                if(!pq.remove(temp+i))
                    return false;
            }
        }
        
        return true;
    
    }
}