class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        
         int [][] dp= new int[str1.length()+1][str2.length()+1];
        
        
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
}