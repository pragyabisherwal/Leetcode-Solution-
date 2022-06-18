class Solution {
  public boolean helper(int[] nums, boolean [] used , int st , int k , int progress , int target )
  {
        if(k==1)
            return true;
        
        if(progress > target)
        {
           return false;
        }
        
        if(progress==target)
        {
            return helper(nums, used, 0, k-1, 0, target);
        }
        
        for(int i=st ; i<nums.length ; i++)
        {
            if(used[i]==false)
            {
                used[i]=true;
                
                if( helper(nums, used, i+1, k, progress + nums[i], target) )
                    return true;
                
                used[i]=false;
  
            }
        }
         
        return false;
        
    }
    public boolean canPartitionKSubsets(int[] nums, int k) 
    {
        int sum=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            sum+=nums[i];
        }
        
        if(k==0 || sum%k!=0)
        {
            
            return false;
        }
        
        Arrays.sort(nums);
        
        if(sum/k < nums[nums.length-1])
             return false;
            
        
        return helper(nums , new boolean [nums.length], 0 , k , 0 , sum/k);
        
    }
}
