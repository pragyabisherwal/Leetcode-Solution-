class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int count=0;
        int N = nums.length;
        int j=0;
        int res =0;
        
        for(int i=0;i<N;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            
            while(count>k)
            {
                if(nums[j] ==0)
                {
                    count--;
                }
                j++;
            }
            res = Math.max(res, i-j+1);
        }

        return res;
    }
}