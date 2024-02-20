class Solution {
    public class Pair implements Comparable<Pair>
    {
        int val;
        int freq;
        
        Pair(int val , int freq)
        {
            this.val = val;
            this.freq = freq;
        }
        
        public int compareTo(Pair other)
        {
            return Integer.compare(this.freq, other.freq);
        }
    }
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer>hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int num : nums)
        {
            hm.put(num , hm.getOrDefault(num , 0)+1);
        }
        
        for(int num : hm.keySet())
        {
            int value = hm.get(num);
            
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