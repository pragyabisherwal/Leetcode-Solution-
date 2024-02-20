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
            if(this.freq==other.freq)
            {
                return other.val-this.val;
            }
            else
                return this.freq-other.freq;
        }
    }
    
    public int[] frequencySort(int[] nums) 
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
        }
        
        int [] ans = new int[nums.length];
        int k = 0;
      
        
         while (!pq.isEmpty()) 
         {
             Pair temp = pq.remove();
             int first = temp.val;
             int second = temp.freq;
             
             for(int i=0 ; i<second ; i++)
              {  
                 ans[k]=first;
                 k++;
              }
             
        }

       return ans;
    }
}