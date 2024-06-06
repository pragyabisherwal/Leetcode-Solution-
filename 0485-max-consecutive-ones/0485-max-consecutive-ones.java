class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max_one=Integer.MIN_VALUE;
        int max=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==1)
               max++;
            
            else if(nums[i]==0)
            {
               max_one=Math.max(max_one,max);
                max=0;
            }
        }
        
        max_one=Math.max(max_one,max);
        
        return max_one;
    }
}