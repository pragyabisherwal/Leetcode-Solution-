class Solution {
    public int solve(int [] cost , int stair , int[] dp)
    {
       if(stair==0)
        return cost[0];
       if(stair==1)
        return cost[1];
        
        if(dp[stair]!=-1)
            return dp[stair];


         dp[stair] = Math.min(solve(cost , stair-1 , dp) , solve(cost , stair-2 , dp)) +                        cost[stair];
         return dp[stair];
    }

    public int minCostClimbingStairs(int[] cost) 
    {
       int n = cost.length;
       int [] dp = new int[n+1];
       Arrays.fill(dp , -1);
        
       int ans = Math.min(solve(cost , n-1 , dp) , solve(cost , n-2, dp));
       return ans;
    }
}