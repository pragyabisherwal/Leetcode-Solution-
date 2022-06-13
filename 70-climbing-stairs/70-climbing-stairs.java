class Solution {
    
    public int solve(int n , int [] dp)
    {
        if(n==0)
        {
           return 1; 
        }
        
       if(dp[n]!=-1)
       {
           return dp[n];
       }
       
        int ans1=0;
        int ans2=0;
        
       if(n-1 >= 0)
       {
           ans1 =solve(n-1 , dp);
       }
        
       if(n-2 >= 0)
       {
          ans2 =solve(n-2 , dp); 
       }
        
        return dp[n]=ans1+ans2;
    }
    public int climbStairs(int n) 
    {
        int [] dp = new int[n+1];
        Arrays.fill(dp , -1);
        
        int ans =solve(n , dp);
        return ans;
        
    }
}