class Solution {
    public String toLowerCase(String s) 
    {
        String ans = "";
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            
            if(ch>='A' && ch<='Z')
            {
                ch = (char)(ch + 32);
            }
            
            ans+=ch;
            
           
        }
        
        return ans;
    }
}