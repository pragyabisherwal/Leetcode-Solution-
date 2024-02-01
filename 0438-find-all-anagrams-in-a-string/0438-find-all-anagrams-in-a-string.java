class Solution {
    public List<Integer> findAnagrams(String txt, String pat) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();
        
        int count = 0;
        int i = 0;
        int j = 0;
        List<Integer> al = new ArrayList<>();
        int n1= txt.length();
        int n2= pat.length();
        
        for(int k=0 ; k<n2 ; k++)
        {
            hm.put(pat.charAt(k) , hm.getOrDefault(pat.charAt(k), 0)+1);
        }
        
        count = hm.size();
        
        while(j<n1)
        {
            //CALCULATIONS
            if(hm.containsKey(txt.charAt(j)))
            {
               int val = hm.get(txt.charAt(j))-1;
               
               if(val==0)
                count = count-1;
               
               hm.put(txt.charAt(j) , val);
               
            }
            
            //REACHING THE DESIRED WINDOW
            if(j-i+1 < n2)
            {
                j++;
            }
            
            //ON REACHING THE WINDOW
            else if(j-i+1 == n2)
            {
                
                if(count == 0)
                { 
                    al.add(i);
                }
                
                if(hm.containsKey(txt.charAt(i)))
                { 
                    int val1 = hm.get(txt.charAt(i));
                    
                    if(val1==0)
                    count++;
                    
                    hm.put(txt.charAt(i) , val1+1);
                       
                }
                
                i++;
                j++;
              
            }
        }
            
        
        
        return al;
    }
}