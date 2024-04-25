class Solution {
    public boolean isPossible(int day,int[] bloomDay, int m, int k)
    {
        int flower=0;
        int bouquet=0;
        
        for(int bloom : bloomDay)
        {
            if(bloom<=day)
            {
                flower++;
            }
            
            else
            {
               bouquet+=flower/k;
               flower=0; 
            }
         
        }
        bouquet+=flower/k;
        return bouquet>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n = bloomDay.length;
        long val = (long) m * k;
        if(val>n)
          return -1;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;       
        
        for(int num : bloomDay)
        {
            low = Math.min(low , num);
            high = Math.max(high , num);
        }
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(isPossible(mid , bloomDay  , m , k))
              high=mid-1;
            else
                low = mid+1;
        }
        
        return low;
        
        
    }
}