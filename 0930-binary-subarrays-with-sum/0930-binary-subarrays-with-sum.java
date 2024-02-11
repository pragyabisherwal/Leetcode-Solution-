class Solution {
    
    public int atmost(int[] nums, int goal)
    {
        int i=0 , j=0 , count=0;
        int n = nums.length;
        int sum =0;
        
        while(j<n)
        {
            sum = sum + nums[j];
         
            while(i<=j && sum>goal)
            {
                sum = sum - nums[i];
                i++;
            }
            
            count = count + (j-i+1);
            j++;
        }
        
        
        return count;
        
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        return atmost(nums , goal) - atmost(nums , goal-1);
    }
}
