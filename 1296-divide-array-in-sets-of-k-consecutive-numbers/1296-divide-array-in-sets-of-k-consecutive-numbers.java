class Solution {
    public boolean isPossibleDivide(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num : nums)
            pq.add(num);
        
        while(pq.size()>0)
        {
            int temp = pq.poll();
            
            for(int i=1 ; i<k ; i++)
            {
                if(!pq.remove(temp+i))
                    return false;
            }
        }
        
        return true;
    }
}