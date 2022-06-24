class Solution {
    public String reverseWords(String s) 
    {
        Stack <Character> st = new Stack();
        String result="";
        
        
        for(int i=s.length()-1; i>=0 ; i--)
        {
            if(s.charAt(i)!=' ')
            {
                st.push(s.charAt(i));
            }
            
            else if(s.charAt(i)==' ' && st.size()>0)
            {
                while(st.size()>0)
                {
                   result+=st.pop();
                }
                
                result+=' ';
            }
            
            
        }
        
         while(st.size()>0)
        {
          result+=st.pop();
         }
        
        
        
        return result.trim();
        
    }
}