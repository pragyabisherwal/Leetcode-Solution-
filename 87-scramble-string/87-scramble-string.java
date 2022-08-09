class Solution {
    
    HashMap<String,Boolean> hm = new HashMap<>();
    public boolean scrambleString(String s1, String s2)
    {
        if(s1.equals(s2))
            return true;
        
        if(s1.length()<=1)
            return false;
        
        String key = s1+" "+s2;
        
        if(hm.containsKey(key))
        {
            return hm.get(key);
        }

        
        boolean flag=false;
        int n = s1.length();
        
        for(int k=1;k<=s1.length()-1;k++)
        {
            if(scrambleString(s1.substring(0,k),s2.substring(s1.length()-k))==true && 
               scrambleString(s1.substring(k),s2.substring(0, s1.length()-k))==true)
            {
                flag=true;
                break;
            }
            else if(scrambleString(s1.substring(0,k),s2.substring(0,k))==true &&   
                    scrambleString(s1.substring(k),s2.substring(k))==true) 
            {
                flag=true;
                break;
            }   
        }
        
        hm.put(key,flag);
        return flag;
            
    }
    public boolean isScramble(String s1, String s2) 
    {
        if(s1.length()==s2.length())
        {
           return scrambleString(s1 , s2); 
        }
        
        else
            return false;
    }
}