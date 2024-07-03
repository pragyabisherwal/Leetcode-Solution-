class Solution {
    
    /* 
    Two strings are isomorphic if the positions of the characters follow the same pattern. So I'm using maps to compare the position patterns.

        String 1:              A B E A C D B
        index pattern:         0 1 2 0 4 5 1
        String 2:              X Y I X H K Y
        index pattern:         0 1 2 0 4 5 1
        
    */
    
    public boolean isIsomorphic(String s, String t) 
    {
        Map<Character, Integer> mapS = new HashMap<Character, Integer>();
        Map<Character, Integer> mapT = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            //If character is present in map it returns the pair index with it but if not present returns default value -1;
            
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);
                        
            // System.out.println(indexS );
            // System.out.println(indexT);
            
            if (indexS != indexT) {
                return false;
            }
            
            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }
        
        return true;
    }
}