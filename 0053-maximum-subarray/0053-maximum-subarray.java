class Solution {
    public int maxSubArray(int[] nums) 
    {
       int result = Integer.MIN_VALUE;
       int currSum=0;
       for(int num : nums)
       {
           currSum+=num;
           
           result = Math.max(result , currSum);
           
           if(currSum<0)
               currSum=0;
       }
        
        return result;
    }
}