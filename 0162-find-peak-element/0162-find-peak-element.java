class Solution {
    public int findPeakElement(int[] nums) 
    {
        if(nums.length==1)
            return 0;
        
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(mid>0 && mid<nums.length-1)
            {
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;

                else if(nums[mid-1]>nums[mid])
                    end = mid-1;

                else
                    start = mid+1;
            }
            
            else if(mid==0)
            {
                if(nums[mid]>nums[mid+1])
                    return 0;
                else
                    return 1;
            }
            
            else if(mid==nums.length-1)
            {
               if(nums[mid]>nums[mid-1])
                    return nums.length-1;
                else
                    return nums.length-2; 
            }
        }
        
        return -1;
    }
}