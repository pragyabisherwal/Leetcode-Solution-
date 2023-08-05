class Solution {
    public char findTheDifference(String s, String t) 
    {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char key = s.charAt(i);
            
            if (hm.containsKey(key)) 
                hm.put(key, hm.get(key) + 1);
            
            else 
                hm.put(key, 1);
        }
        
        for (int i = 0; i < t.length(); i++) 
        {
            char key = t.charAt(i);
            
            if (!hm.containsKey(key)) 
                return key;
            
            else if (hm.get(key) == 0) 
                return key;
            
            else if (hm.containsKey(key) ) 
                hm.put(key, hm.get(key) - 1);
        }
        
        return 'n';
    }
}