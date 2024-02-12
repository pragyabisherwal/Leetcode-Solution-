class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i=0 , j=0 , maxRepeatCount=0 , nonRepeatCount=0 , maxLen=0;
        int charsCount[] = new int[26];        
        
        while(j<n)
        {
            char ch = s.charAt(j);
            charsCount[ch - 'A']++;
            
            maxRepeatCount=Math.max(maxRepeatCount , charsCount[ch - 'A']);
            nonRepeatCount = (j-i+1) - maxRepeatCount;
            
            if(nonRepeatCount > k)
            {   
                charsCount[s.charAt(i) - 'A']--;
                i++;
            }
            
            maxLen = Math.max(maxLen , j-i+1);
            j++;
        }
        
        return maxLen;
        
    }
}