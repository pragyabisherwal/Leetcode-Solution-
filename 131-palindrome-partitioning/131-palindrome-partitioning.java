class Solution {
    
    List<List<String>> result = new ArrayList<> ();
    
    public List<List<String>> partition(String s) 
    {
        List<String>temp = new ArrayList<> ();
        helper(s , temp); 
        return result;
    }
    
    public void helper(String str , List<String>temp)
    {
        if(str.length()==0)
        {
            result.add(new ArrayList(temp));
            return;
        }
        
        for(int i=0 ; i<str.length() ; i++)
        {
            String prefix = str.substring(0,i+1);
            String restStr =str.substring(i+1);
            
            if(isPalindrome(prefix))
            {
                temp.add(prefix);
                helper(restStr,temp);
                temp.remove(temp.size()-1);
            }
        }
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
}