class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        if(nums.length==0||target==0) 
            return 0;
        
        int left=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
        
        for(int right=0 ; right<nums.length ; right++)
        {
            sum = sum + nums[right];
            
            while(sum>=target)
            {
                count = Math.min(count , (right-left+1));
                sum=sum - nums[left];
                left++;
                   
            }
        }
        
        return (count!=Integer.MAX_VALUE)?count :0;
    }
}