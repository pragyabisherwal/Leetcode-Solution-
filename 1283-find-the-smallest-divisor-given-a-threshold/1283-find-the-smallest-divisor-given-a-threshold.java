class Solution {
     public int checkDivisor(int[] nums, int maxNum)
    {
        int add=0;
        
        for(int num : nums)
        {
            add+=num/maxNum;
            
            if(num%maxNum!=0)
                add++;
        }
        
        return add; 
         
    }
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int low=1;
        int high=Integer.MIN_VALUE;       
        
        for(int num : nums)
        {
            high = Math.max(high , num);
        }
        
        while(low<high)
        {
           int mid = low + (high-low)/2;
           int divisor = checkDivisor(nums , mid);
            
            if(divisor<=threshold)
            {
               //Possible answer but we can find the smaller than this divisor
                high=mid;
            }
            
            else
                low = mid+1;

        }
        
        return low;
    }
}