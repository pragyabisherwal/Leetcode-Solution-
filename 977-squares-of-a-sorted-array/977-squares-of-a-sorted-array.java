class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int [] res = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=res.length-1;
        
        while(k>=0)
        {
            if(Math.abs(nums[i])  <  Math.abs(nums[j]))
            {
                  res[k]=nums[j]*nums[j];
                  j--;
            }
            
            else
            {
                 res[k]=nums[i]*nums[i];
                  i++; 
            }
            
            k--;
        }
        
        return res;
    }
}