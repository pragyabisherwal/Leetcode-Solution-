class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid=0;
        
        while(left < right)
        {
            mid = left + (right - left) / 2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            
            else if(nums[mid] > target)
            {
                right = mid;
            } 
            
            else 
            {
                left = mid + 1;
            }
        }
        
        if (left == n - 1 && nums[n- 1] < target)
        return nums.length;
        
        return right;
    }
}