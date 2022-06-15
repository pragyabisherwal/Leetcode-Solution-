class Solution {
    public int lengthOfLIS(int[] nums) 
    {
        int [] dp = new int[nums.length];
        
        dp[0]=1;
        
        int max_Ans=1;
        
        for(int i=1; i<dp.length ; i++)
        {
            int max=0;
            for(int j=0 ; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                 if(max<dp[j])
                    max=dp[j];
                }
               
            }
            
            dp[i]=max+1;
            
            if(dp[i]>max_Ans)
                max_Ans=dp[i];
        }
        
       
        return max_Ans;
    }
}