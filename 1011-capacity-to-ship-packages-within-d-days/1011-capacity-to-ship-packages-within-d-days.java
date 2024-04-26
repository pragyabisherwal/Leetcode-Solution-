class Solution {
    public boolean isPossible(int weight,int[] weights, int days)
    {
        int totalW=0;
        int totalD=1;
        
        for(int num : weights)
        {
            if(totalW+num<=weight)
                totalW+=num;
            else
            {
                totalD++;
                totalW=num;        
            }
            
            if(totalD>days)
                return false;
        }
        
        return true;
    }
    public int shipWithinDays(int[] weights, int days)
    {
        int n = weights.length;
        int low=Integer.MIN_VALUE;
        int high=0;
        
        for(int num : weights)
        {
            low = Math.max(num , low);
            high+=num;
        }
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(isPossible(mid , weights , days))
                high = mid-1;
            
            else
                low=mid+1;
        }
        
        return low;
            
    }
}