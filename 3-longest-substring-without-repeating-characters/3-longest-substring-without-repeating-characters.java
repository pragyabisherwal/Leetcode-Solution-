class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int i=-1;
        int j=-1;
        int ans=0;
        
        HashMap<Character,Integer> hm = new HashMap<> ();
        
        while(true)
        {
            boolean f1=false;
            boolean f2=false;
            while(i<s.length()-1)
            {
                f1=true;
                i++;
                char ch = s.charAt(i);
                hm.put(ch , hm.getOrDefault(ch,0)+1);
                
                if(hm.get(ch)==2)
                    break;
                else
                {
                    int len = i-j;
                    if(len>ans)
                        ans=len;
                }
            }
            
            while(j<i)
            {
                f2=true;
                j++;
                char ch = s.charAt(j);
                hm.put(ch , hm.get(ch)-1);
                
                 if(hm.get(ch)==1)
                    break;
           
            }
            
            if(f1==false && f2==false)
                break;
        }
        
        return ans;
    }
}