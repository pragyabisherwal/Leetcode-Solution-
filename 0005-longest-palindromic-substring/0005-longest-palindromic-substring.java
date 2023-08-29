class Solution {
    public int length(String s , int left , int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        
        return (right-1)-(left+1)+1;
    }
    public String longestPalindrome(String s) 
    {
        int start=0;
        int end=0;
        
        for(int i=0 ; i<s.length() ; i++)
        {
            int odd = length(s , i , i);
            int even = length(s , i , i+1);
            
            int len = Math.max(odd , even);
            int maxLen=end-start;
            
            if(len>maxLen)
            {
                start = i - (len-1)/2;
                end   = i+len/2; //as palindrome both sides length will be equal so length/2 from the current index on to the right
            }
  
        }
        
        return s.substring(start , end+1);
    }
}