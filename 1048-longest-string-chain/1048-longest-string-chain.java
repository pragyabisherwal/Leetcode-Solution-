class Solution {
    public int longestStrChain(String[] words) 
    {
        Arrays.sort(words , (a,b)->a.length() - b.length());
        
        int res=0;
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(String word : words)
        {
            int n = word.length();
            hm.put(word , 1);
            
            for(int i=0 ; i<n ; i++)
            {
                StringBuilder current = new StringBuilder(word);
                String next = current.deleteCharAt(i).toString(); 
                
                if(hm.containsKey(next))
                {
                    hm.put(word , Math.max(hm.get(word) , hm.get(next)+1));
                }
                
            }
            
            res = Math.max(res , hm.get(word));
        }
        
        return res;
    }
}