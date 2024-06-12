class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int positiveIdx=0;
        int negativeIdx=1;
        int [] result = new int[nums.length];
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]>0)
            {
               result[positiveIdx]=nums[i];
                positiveIdx=positiveIdx+2;
            }
            
            else if(nums[i]<0)
            {
               result[negativeIdx]=nums[i];
               negativeIdx=negativeIdx+2;
            }
        }
        
        
        return result;
        
    }
}