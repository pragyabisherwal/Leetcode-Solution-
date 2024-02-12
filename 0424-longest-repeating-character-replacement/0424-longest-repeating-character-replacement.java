class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i=0 , j=0 , maxRepeatCount=0 , nonRepeatCount=0 , maxLen=0;
        HashMap<Character , Integer> hm = new HashMap<>();
        
        while(j<n)
        {
            char ch = s.charAt(j);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);
            
            maxRepeatCount=Math.max(maxRepeatCount , hm.get(ch));
            nonRepeatCount = (j-i+1) - maxRepeatCount;
            
            if(nonRepeatCount > k)
            {
                hm.put(s.charAt(i) , hm.get(s.charAt(i))-1);
                i++;
            }
            
            maxLen = Math.max(maxLen , j-i+1);
            j++;
        }
        
        return maxLen;
        
    }
}