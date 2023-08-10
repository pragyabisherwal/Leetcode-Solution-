class Solution {
    public boolean isIdealPermutation(int[] nums) {

        //Every local inversion is a global inversion , if we find any inversion which is not local it means it is global and hence number of global and local will not be equal.
        
        int max = -1;
        
        for(int i=0 ; i<nums.length-2 ; i++)
        {
           max = Math.max(nums[i] , max);
            
            if(max>nums[i+2])
                return false;
        }
        return true; 
    }
}