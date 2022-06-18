class Solution {
    
    public boolean targetSum(int[] nums , int tar)
    {
        boolean [][] dp = new boolean [nums.length+1][tar+1];
            
            for(int i=0 ; i<dp.length ; i++)
            {
                for(int j=0 ; j<dp[0].length ; j++)
                {
                    if(j==0)
                        dp[i][j]=true;
                    
                    else if(i==0)
                        dp[i][j]=false;
                    
                    else
                    {
                        if(dp[i-1][j])
                            dp[i][j]=true;
                        
                        else
                        {
                            if(j>=nums[i-1])
                            {
                                if(dp[i-1][j-nums[i-1]])
                                 dp[i][j]=true;
                                
                                else
                                    dp[i][j]=false;
                                    
                            }
                        }
                            
                    }
                }
            }
        
        return dp[nums.length][tar];
    }
    public boolean canPartition(int[] nums) 
    {
        int sum=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            sum+=nums[i];
        }
        
       
        
        if(sum%2!=0)
            return false;
        

        return targetSum(nums , sum/2);
          
        
    }
}