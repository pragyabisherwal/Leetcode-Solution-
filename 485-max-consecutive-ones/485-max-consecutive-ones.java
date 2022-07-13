class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int count=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            
            else if(nums[i]==0)
            {
                count=0;
            }
            
            max = Math.max(count , max);
        }
        
        return max;
    }
}