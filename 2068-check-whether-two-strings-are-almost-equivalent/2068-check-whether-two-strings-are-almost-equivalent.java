class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();
        
        for(int i=0 ; i<word1.length() ; i++)
        {
            char ch = word1.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);
        }
        
        for(int i=0 ; i<word2.length() ; i++)
        {
            char ch = word2.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0)-1);
        }
        
        for(int num : hm.values())
        {
            System.out.println(num);
            if(num>3 || num < -3)
                return false;
                
        }
        
        return true;
    }
}