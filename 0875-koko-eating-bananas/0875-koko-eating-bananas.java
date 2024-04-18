class Solution {
    public int checkTime(int[] piles, int maxpiles)
    {
        int hours=0;
        
        for(int pile : piles)
        {
            hours+=pile/maxpiles;
            
            if(pile%maxpiles!=0)
                hours++;
        }
        
        return hours; 
    }
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n = piles.length;
        int low=1;
        int high=Integer.MIN_VALUE;
        int ans = -1;
        
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        
        while(low<high)
        {
            int mid = low + (high-low)/2;
            
            int reqTime = checkTime(piles , mid);
            
            if(reqTime<=h)
            {
                ans = mid;
                high=mid;
            }
            
            else
                low = mid+1;
                
        }
        
        return low;
    }
    
}