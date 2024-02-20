class Solution {
    public class Pair implements Comparable<Pair>
    {
        int val;
        int diff;
        
        Pair(int val , int diff)
        {
            this.val = val;
            this.diff = diff;
        }
        
        public int compareTo(Pair other)
        {
            return Integer.compare(this.diff, other.diff);
        }
    }
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer>hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i : nums)
        {
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }
        
        for (int num : hm.keySet())
        {
            Integer value = hm.get(num);
            
            Pair temp = new Pair(num , value);
            
            pq.add(temp);
            
            if(pq.size()>k)
                pq.remove();
        }
        
        int [] arr = new int[k];
        k--;
        
         while (!pq.isEmpty()) {
             arr[k]=pq.remove().val;
             k--;
        }

       return arr;
    }
}