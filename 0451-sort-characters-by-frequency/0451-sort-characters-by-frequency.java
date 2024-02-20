class Solution {
    public class Pair implements Comparable<Pair>
    {
        char val;
        int freq;
        
        Pair(char val , int freq)
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
    public String frequencySort(String s) 
    {
        HashMap<Character,Integer>hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);
        }
        
        for(char ch: hm.keySet())
        {
            int value = hm.get(ch);
            
            Pair temp = new Pair(ch , value);
            
            pq.add(temp);
        }
        
        String ans= "";
        int k = 0;
      
        
         while (!pq.isEmpty()) 
         {
             Pair temp = pq.remove();
             char first = temp.val;
             int second = temp.freq;
             
             for(int i=0 ; i<second ; i++)
              {  
                 ans+=first;
              }
             
        }

       return ans;
    }
}