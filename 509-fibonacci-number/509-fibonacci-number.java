class Solution {
    
    public int fib(int n) 
    {
        if(n==0 || n==1)
            return n;
        
        int [] dp = new int[n+1];
        
        for(int i=0 ; i <dp.length; i++)
        {
            if(i==0 || i==1)
                dp[i]=i;
            
            else
                dp[i]=dp[i-1]+dp[i-2];
        }
       
      
        return dp[n];
        
    }
}