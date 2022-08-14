class Solution {
    public int minimumMountainRemovals(int[] nums) 
    {
        int n = nums.length;
        
        int [] LIS = new int[n];
        
        for(int i=0;i<n ; i++)
        {
            int max=0;
            for(int j=0 ; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                 if(max<LIS[j])
                    max=LIS[j];
                }
               
            }
            
            LIS[i]=max+1;
        }
        
        
        int [] LDS = new int[n];
        for(int i=n-1; i>=0 ; i--)
        {
            int max=0;
            for(int j=i+1;j<n ; j++)
            {
                if(nums[j]<nums[i])
                {
                 if(max<LDS[j])
                    max=LDS[j];
                }
               
            }
            
            LDS[i]=max+1;
        }
        
        
        
        int overAllmax = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++)
        {
            if(LIS[i] >1 &&    LDS[i]> 1)
                overAllmax = Math.max(overAllmax , LIS[i]+LDS[i]);
        }
        
        return n-(overAllmax-1);   
        
    }
}