class Solution {
    public boolean isPalindrome(String s) 
    {
        int start = 0;
        int last = s.length()-1;
        
        while(start<=last)
        {
            char ch1=s.charAt(start);
            char ch2=s.charAt(last);
            
            if(!Character.isLetterOrDigit(ch1))
                start++;
            
            else if(!Character.isLetterOrDigit(ch2))
                last--;
            
            else
            {
                if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
                    return false;
                
                start++;
                last--;
            }
            
        }
        return true;
        
    }
}