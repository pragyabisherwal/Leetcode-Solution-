class Solution {
    public static int ans;
    
    public static int reversePairs(int[] nums) {
        ans=0;
        helper(nums , 0 , nums.length-1); 
        return ans;
        
    }
    
    public static void helper(int [] nums , int lo , int hi)
    {
        if(lo<hi)
        {
            int mid = lo + (hi-lo)/2;
            helper(nums , lo , mid);
            helper(nums,mid+1 , hi);
            
            int i=lo;
            int j=mid+1;
            
           while(i<=mid && j<=hi)
           {
               if((long)nums[i] > (long)2*nums[j])
               {
                   j++;
                   ans+=mid-i+1;
               }
               
               else
               {
                   i++;
               }
           }
            
            Arrays.sort(nums , lo , hi+1);
        }
    }
}