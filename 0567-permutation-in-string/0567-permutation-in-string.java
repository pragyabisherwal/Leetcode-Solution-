class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
         if(s2.length()==0||s1.length()>s2.length())
            return false;
         
        if(s1.length()==0)
            return true;
        
        int x = s1.length() , y=s2.length();
        
        int [] map1 = new int[26];
        int [] map2 = new int[26];
       
        int left=0 , right=0;
        
        for(int i=0 ; i<x ; i++)
        {
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;  
        }
        
        //Rest of the window 
        for(int i=x ; i<y ; i++)
        {
            if(Arrays.equals(map1 , map2))
                return true;
            
             map2[s2.charAt(i-x)-'a']--;  
             map2[s2.charAt(i)-'a']++;  
        }
        
        if(Arrays.equals(map1 , map2))
                return true;
        
        return false;
        
    }
}