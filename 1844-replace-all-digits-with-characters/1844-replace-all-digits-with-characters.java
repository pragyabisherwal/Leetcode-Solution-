class Solution {
    public String replaceDigits(String s) 
    {
        String ans = "";
        for(int i=0 ; i<s.length() ; i=i+1)
        {
            
            int num = s.charAt(i)-'0';
            
            if(num>=0 && num<=9)
            {
                char ch = s.charAt(i-1);
                char n = (char)(ch + num);
                ans+=n;
            }
            
            else
            ans +=s.charAt(i); 
            
        }
        
        return ans;
    }
}