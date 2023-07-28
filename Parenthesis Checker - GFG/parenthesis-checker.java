//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
   
    static boolean ispar(String x)
    {
        if(x.length()==1)
         return false;
        
        int i=0;
        Stack <Character> st = new Stack <>();
        
        while(x.length()>i)
        {
           char ch = x.charAt(i);
          
           if(ch == '{' || ch == '[' || ch == '(')
            st.push(ch);
           
           else
           {
             if(st.size()==0)
              return false;
              
             char top = st.peek();
             
             if(ch == '}' && top == '{')
              st.pop();
             
             else if(ch == ']' && top == '[')
              st.pop();
             
             else if(ch == ')' && top == '(')
              st.pop();
              
              else
               return false;
           }
           
           i++;
        }
        
        if(st.size()==0)
         return true;
        
        else
         return false;
        
    }
}
