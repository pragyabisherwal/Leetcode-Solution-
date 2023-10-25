class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        
        String r = "";
        
        for(int i=n-1 ; i>=0 ; i--)
        {
            char ch = s.charAt(i);
            r+=ch;
        }
        System.out.println(r);
        
        int [][] dp = new int[n+1][n+1];
        
        for(int i=0 ; i<n ; i++)
            dp[0][i]=0;
        
        for(int i=0 ; i<n ; i++)
            dp[i][0]=0;
        
        
        for(int i=1; i<dp.length ; i++)
        {
            for(int j=1 ; j<dp[0].length ; j++)
            {
                
                if(s.charAt(i-1) == r.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                    
            }
        }
        return dp[n][n];
        
    }
}