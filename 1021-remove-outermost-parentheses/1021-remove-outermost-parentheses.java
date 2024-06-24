class Solution {
    /////1ST APPROACH
    public int check(int i , String s)
    {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(i));
        i++;
        
        
        while(st.size()>0)
        {
            //System.out.println("heyy");
            if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            
            else
                st.pop();
            
            i++;
        }
        
        return i-1;
    }
//     public String removeOuterParentheses(String s) 
//     {
//         int i=0 , len=0;
        
//         String ans="";
//         //System.out.println(s.length());
//         while(len<s.length())
//         {  
//            if(i>=s.length())
//                break;
            
//            len =check(i , s);
//            String sub = s.substring(i+1 , len); 
            
//            ans +=sub;
//            //System.out.println(ans);
//            i = len+1;
//            //System.out.println(i);
//         }
        
//         return ans;
//     }
    
    /////// 2ND APPROACH
    public String removeOuterParentheses(String s) 
    {
        int counter = 0;
        String ans = "";
        
        for(int i=0 ; i<s.length() ; i++)
        {
          if(s.charAt(i)==')')
           counter--;
            
          if(counter!=0)
            ans+=s.charAt(i);
            
          if(s.charAt(i)=='(')
              counter++;   
        }
        
        return ans;
    }
}