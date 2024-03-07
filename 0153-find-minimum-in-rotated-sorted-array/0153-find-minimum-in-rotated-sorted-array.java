class Solution {
    public int findMin(int[] nums) {
        int start =0;
        int n = nums.length;
        int end = n-1;
        while(start <= end){
            if (nums[start] < nums[end]) return nums[start];
            int mid = start + (end - start)/2;
            if(nums[mid] <= nums[(mid+1)%n] && nums[mid] <= nums[(mid+n-1)%n]){
                return nums[mid];
            }
            else if(nums[start] <= nums[mid]){
                start = mid+1;
            }
            else if(nums[mid] <= nums[end]){
                end = mid -1;
            }
        }
        return -1;
    }
}