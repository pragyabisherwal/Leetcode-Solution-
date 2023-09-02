class Solution {
     public boolean equalCount(int[] data) 
     {
        int lastCount = 0;
        
        for (int count: data) 
        {
           if (count == 0) 
               continue;
            
           if (lastCount != 0 && count != lastCount) 
               return false;
            
            lastCount = count;
        }
        
        return true;
    }
    public boolean equalFrequency(String word) 
    {
        int len = word.length();
        int[] count = new int[26];
        
        for (int i = 0; i < len; ++ i) 
        {
            char c = word.charAt(i);
            count[c - 'a'] ++;
        }
        
        for (int i = 0; i < len; ++ i) 
        {
            char c = word.charAt(i);
            count[c - 'a'] --;
           
            if (equalCount(count)) 
            {
                return true;
            }
            
            count[c - 'a'] ++;
        }
        
        return false;
    }
}