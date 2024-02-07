class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0 , j=0 ;
        int max_len=0;
        Map<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        
        while(j<n)
        {
            hm.put(s.charAt(j) , hm.getOrDefault(s.charAt(j) , 0)+1);
            int k=j-i+1;
            
            
            if(hm.size()>j-i+1)
                j++;
            
            else if(hm.size()==j-i+1)
            {
                max_len = Math.max(max_len ,j-i+1);
                j++;
            }
            
            else if(hm.size()<j-i+1)
            {
                while(hm.size()<j-i+1)
                {
                    char ch = s.charAt(i);
                    if(hm.containsKey(ch))
                    {
                        int freq=hm.get(ch);
                        freq--;
                        
                        if(freq==0)
                        hm.remove(ch);
                        
                        else
                        hm.put(ch , freq);
                     }
                   
                    i++;
                }
                
                if(hm.size()==j-i+1)
                    max_len = Math.max(max_len ,j-i+1);      
                  
                j++;
            }
            
          
        }
        
        return max_len;
        
    }
}