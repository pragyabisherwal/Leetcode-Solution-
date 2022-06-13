class Solution {
    public void solve(int curr,int n , int [] dp)
    {
        if(curr==dp.length)
        {
            return;
        }
        
        dp[curr]=dp[curr-1] + dp[curr-2];
       
        solve(curr+1 , n , dp );
        
    }
    public int fib(int n) 
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        
        int [] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        
        solve(2 , n , dp);
        return dp[n];
        
    }
}