class Solution {
    public String reverseWords(String s) 
    {
        int i = s.length()-1;
        int n = s.length();
        String ans = "";
        
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ')
            i--;
        
            int j = i;
            
            if(i<0)
                break;
            
            while(i>=0 && s.charAt(i)!=' ')
            i--;
            
            if(ans.length()==0)
             ans = ans + s.substring(i+1 , j+1);
            
            else
             ans = ans + ' ' + s.substring(i+1 , j+1);
            
            //j = i+1;
            
        }
        
        return ans;
        
    }
}