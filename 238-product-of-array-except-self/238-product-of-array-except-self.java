class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        
        int [] left = new int[n];
        
        for(int i=0 ; i<n ; i++)
        {
            if(i==0)
                left[i]=1;
            
            else
            left[i] = left[i-1] * nums[i-1];
        }
        
        int right=1;
        
        for(int j=n-1 ; j>=0 ; j--)
        {
            left[j] = left[j] * right;
            
            right = right * nums[j];
        }
        
        return left;
    }
}