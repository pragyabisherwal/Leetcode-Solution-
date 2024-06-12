class Solution {
    public int maxSubArray(int[] nums) 
    {
       // if sum goes to negative make sum = 0 otherwise keep on adding
        int sum = 0;
        int maxSum = nums[0];

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            maxSum = sum>maxSum?sum:maxSum;
            if(sum<0){
                sum =0;
            }
        }
        return maxSum;
    }
}