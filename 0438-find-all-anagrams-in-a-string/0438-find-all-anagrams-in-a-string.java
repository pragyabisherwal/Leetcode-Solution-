class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int x = s.length() , y = p.length();
        
        List<Integer> al = new ArrayList<>();
        
        if(y>x)
            return al;
       
        
        int [] map1 = new int[26];
        int [] map2 = new int[26];
        
        for(int i=0 ; i<y ; i++)
        {
            map1[p.charAt(i)-'a']++;
            map2[s.charAt(i)-'a']++;
        }
        
        int i=0;
        
        for(i=y ; i<x ; i++)
        {
            if(Arrays.equals(map1 , map2))
                al.add(i-y);
            
            map2[s.charAt(i-y)-'a']--;
            map2[s.charAt(i)-'a']++;
        }
        
          if(Arrays.equals(map1 , map2))
                al.add(i-y);
        
        return al;
        
        
        
    }
}