class Solution {
     int [][] dp;
    public int LCS(String str1, String str2) 
    {
       dp= new int[str1.length()+1][str2.length()+1];
        
        
        for(int i=0 ; i<dp.length ; i++)
        {
            for(int j=0 ; j<dp[0].length ; j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                
                else
                {
                   dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
    
    public String shortestCommonSupersequence(String str1, String str2) {
        String ans="";
        int lc= LCS( str1,str2);
        
        
        //FINDING THE LCS STRING FROM THE DP;
        int k=str1.length();
        int l=str2.length();
        String lcs="";
        
        
        while(k>0 && l>0)
        {
           if(str1.charAt(k-1) == str2.charAt(l-1)) {
                lcs = str1.charAt(k-1) + lcs;
                k--;
                l--;
            }
            else {
                if(dp[k-1][l] > dp[k][l-1]) {
                    k--;
                }
                else 
                    l--;
            } 
        }
        
        int p1=0;   // Pointing on string 1
        int p2=0;   // Pointing on string 2
        
        for(int i=0 ; i<lcs.length() ; i++)
        {
            char ch = lcs.charAt(i);
            //Adding the characters of string 1 till we do not find a character which is there in Lcs
            while(str1.charAt(p1)!=ch)
            {
                ans=ans+str1.charAt(p1++);
               
            }
            
             //Adding the characters of string 2 till we do not find a character which is there in Lcs
            while(str2.charAt(p2)!=ch)
            {
                ans=ans+str2.charAt(p2++);
              
            }
            
           //Now both the strings are pointing towards the char which is in lcs so add that char once and 
           //increase the pointer of both the strings
            ans=ans+ch;
            ++p1;
            ++p2;
            
        }
        
        //If there are some leftover words in the string add them in the ans
        ans=ans+str1.substring(p1) + str2.substring(p2);
        
        
        return ans;
        
    }
}