class Solution {
    public String minWindow(String s, String t) 
    {
       HashMap<Character,Integer> map=new HashMap<>();
        
       for(int x=0;x<t.length();x++) {
           char c=t.charAt(x);
           map.put(c, map.getOrDefault(c,0)+1);
       }
        
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        int temp=min;
        int count=map.size();
        int start=0;
        
        while(j<s.length())
        {
            char c=s.charAt(j);
            
            if(map.containsKey(c))
            {
                map.put(c, map.getOrDefault(c,0)-1);
                
                if(map.get(c)==0)
                {
                    count--;
                }
            }
            
            if(count>0)
                j++;
            
            else
            {
                 //As we need to print the substring we have to store the starting index                     from where the string is starting so if the earlier min is not as same as          the new min means the length has updated and we have to now store its starting point
                temp=min;

                min=Math.min(min,j-i+1);
                if(temp!=min)
                    start=i;

                while(count==0)
                {
                    char c2=s.charAt(i);
                    
                    if(map.containsKey(c2))
                    {
                        map.put(c2,map.getOrDefault(c2,0)+1);
                       
                        if(map.get(c2)==1)
                            count++;
                    }
                    
                    i++;
                    
                    if(count==0)
                    {
                        min=Math.min(min,j-i+1);
                        
                //As we need to print the substring we have to store the starting index                         from where the string is starting
                        if(temp!=min)
                            start=i;
                    }
                }
                j++;

            }

        }
        
        if(min==Integer.MAX_VALUE)
            return("");                           //1
       
        return(s.substring(start,start+min));  //2


    }
}