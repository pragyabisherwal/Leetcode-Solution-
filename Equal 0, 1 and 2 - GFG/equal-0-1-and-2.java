//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        int zero=0;
        int one=0;
        int two=0;
        long ans=0;
        
        String key = (one-zero)+"#"+(two-one);
        HashMap<String , Integer> hm = new HashMap <> ();
        hm.put(key , 1);
        
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            
            if(ch=='0')
            zero++;
            
            else if(ch=='1')
            one++;
            
            else if(ch=='2')
            two++;
            
             key = (one-zero)+"#"+(two-one);
            if(hm.containsKey(key))
            {
                ans+=hm.get(key);
                hm.put(key , hm.get(key)+1);
            }
            
            else
            hm.put(key ,1);
            
            
        }
        
        return ans;
        
    }
} 