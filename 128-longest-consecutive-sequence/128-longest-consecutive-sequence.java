class Solution {
    public int longestConsecutive(int[] nums) 
    {
       HashMap <Integer , Boolean> hm = new HashMap<> ();
       
        for(int ele : nums)
        {
            hm.put(ele , true);
        }
        
        for(int ele : nums)
        {
            if(hm.containsKey(ele-1))
            {
                hm.put(ele , false);
            }
        }
        
        int maxLen=0;
        
        for(int ele : nums)
        {
            if(hm.get (ele)==true)
            {
                int len=1;
                
                while(hm.containsKey(ele+len))
                {
                    len++;
                }
                
                if(len>maxLen)
                {
                    maxLen=len;
                }
                    
                
                
            }            
        }
        
        return maxLen;
       
        
    }
}