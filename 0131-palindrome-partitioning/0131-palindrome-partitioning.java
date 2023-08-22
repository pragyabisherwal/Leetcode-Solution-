class Solution {
    List<List<String>> result = new ArrayList<> ();
    
    public List<List<String>> partition(String s) 
    {
        List<String>temp = new ArrayList<> ();
        helper(s , temp); 
        return result;
    }
    
    public boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public void helper (String s, List<String>temp) 
    {
         if(s.length()==0)
        {
            result.add(new ArrayList(temp));
            return;
        }
        
        for(int i=0 ; i<s.length() ; i++)
        {
            String str = s.substring(0 , i+1);
            String rem = s.substring(i+1);
            
            if(isPalindrome(str))
            {
               temp.add(str);
               helper(rem , temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}