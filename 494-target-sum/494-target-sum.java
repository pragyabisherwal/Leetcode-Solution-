class Solution {
    public int perfectSum(int arr[],int n, int sum) 
	{ 
	   int [][] dp = new int[n+1][sum+1];
	  
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
               if(j==0)
                 dp[i][j] = 1;
                 
                else if(i==0)
                 dp[i][j]=0;
               
               else if(arr[i-1]>j || arr[i-1]==0)
                 dp[i][j]=dp[i-1][j];
                  
               else if(arr[i-1]<=j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                    
                }
                
            }
        }
        
        return dp[n][sum];
	} 
    public int findTargetSumWays(int[] nums, int target) 
    {
        if(nums.length==1)
        {
            if(Math.abs(nums[0])==Math.abs(target))
                return 1;
            
            else
                return 0;
        }
        
        // To count the number of zeroes
        int zero = 0;
        int range=0;

        for (int i = 0; i <nums.length; i++)
          {  
            if (nums[i] == 0)
                zero++;
           
             range+=nums[i];
          }
        
        if(target>range || target<(-1)*range || (range+target)%2!=0)
            return 0;
        
        else
        {
            int result = perfectSum(nums , nums.length , (range+target)/2);
             return (int)Math.pow(2,zero)*result;
        }
    
    }
}