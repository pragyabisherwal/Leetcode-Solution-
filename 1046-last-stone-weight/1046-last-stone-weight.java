class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue <Integer> pq = new PriorityQueue (Collections.reverseOrder());
        
        for(int n : stones)
        {
            pq.add(n);
        }
        
        while(pq.size()>1)
        {
            int stone1=pq.remove();
            int stone2=pq.remove();
            
            if(stone1!=stone2)
                pq.add(Math.abs(stone1-stone2));
        }
        
        return pq.size()==0?0:pq.peek();
        
    }
}