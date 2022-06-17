class Solution {
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        int n = s.length();
        int [] dp = new int[n];
        
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                String toCheck = s.substring(j , i+1);
      
                if(wordDict.contains(toCheck)==true)
                {
                    if(j>0)
                        dp[i]+=dp[j-1];
                    
                    else
                        dp[i]+=1;
                }
            }
        }
        
        return dp[n-1]>0;
           
    }
}