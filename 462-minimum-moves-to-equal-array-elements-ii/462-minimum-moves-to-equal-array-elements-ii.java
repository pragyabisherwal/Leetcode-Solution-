class Solution {
    public int minMoves2(int[] nums) 
    {
        Arrays.sort(nums);
        
        int mid = (0+nums.length-1 )/2;
        int check = nums[mid];
        int moves=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
             moves += Math.abs(check-nums[i]);
        }
        
        return moves;
    }
}