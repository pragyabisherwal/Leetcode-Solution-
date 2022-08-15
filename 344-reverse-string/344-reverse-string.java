class Solution {
    public void reverseString(char[] s) 
    {
        int n = s.length;
        
         int lo=0;
         int hi=s.length-1;
                 
        while(lo<hi)
        {
          char ch = s[lo];
          s[lo]=s[hi];
          s[hi]=ch;
            
            
            lo++;
            hi--;
                     
        }
        
        
    }
}