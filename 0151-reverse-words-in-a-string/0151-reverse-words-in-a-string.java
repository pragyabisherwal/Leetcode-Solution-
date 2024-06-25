class Solution {
    public String reverseWords(String s) 
    {
        int n = s.length()-1;
        int end = n;
        String ans = "";
        
        while(end>=0)
        {
            while(end>=0 && s.charAt(end)==' ')
                end--;
            
            int start = end;
            
            if(end<0)
                break;
            
            while(end>=0 && s.charAt(end)!=' ')
                end--;
            
            if(ans.length()==0)
                ans+=s.substring(end+1 , start+1);
            
            else
                ans = ans + ' ' + s.substring(end+1 , start+1);
        }
        
        return ans;
    }
}