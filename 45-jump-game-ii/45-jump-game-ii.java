class Solution {
    public int jump(int[] nums) 
    {
        int n = nums.length;
        
        Integer [] dp = new Integer[n];
        dp[n-1]=0;
        
        for(int i=n-2;i>=0;i--)
        {
            int min = Integer.MAX_VALUE;
            for(int jump=1 ; jump <= nums[i] && jump+i<nums.length ; jump++)
            {
                if(dp[i+jump]!=null && dp[i+jump]<min)
                    min=dp[i+jump];
                
            }
            
            if(min!=Integer.MAX_VALUE)
                dp[i]=min+1;
                
        }
        
        return dp[0];
        
        
    }
}