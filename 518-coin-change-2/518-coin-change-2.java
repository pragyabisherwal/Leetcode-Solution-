class Solution {
    public int change(int amount, int[] coins) 
    {
        int [] dp = new int[amount+1];
        
        
        for(int i=0 ; i<coins.length ;i++)
        {
            for(int j=0 ; j<dp.length ; j++)
            {
                if(j==0)
                    dp[j]=1;
                
                else if(j-coins[i]>=0)
                {
                    dp[j]=dp[j]+dp[j-coins[i]]; 
                }
            }
        }
        
        return dp[dp.length-1];
        
    }
}