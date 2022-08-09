class Solution {
    
    int [][] dp;
    
    public int eggDrop(int egg , int floor)
    {
        if(floor==0 || floor==1)
            return floor;
        
        if(egg==1)
            return floor;
        
        if(dp[egg][floor]!=-1)
            return dp[egg][floor];
        
        int low = 1, high = floor;
        int min = Integer.MAX_VALUE;
        while (low < high) 
        {
            int mid = low + (high - low) / 2;
            
            int left = eggDrop(egg - 1, mid - 1);
            int right = eggDrop(egg, floor - mid);
            
            int temp = Math.max(left, right) + 1;
            
            min = Math.min(min, temp);
            
            if (left == right) 
            {
                break;
            } 
            else if (left < right) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid;
            }
        }
        return dp[egg][floor]=min;
        
    }
    public int superEggDrop(int egg, int floor) 
    {
        dp = new int[egg+1][floor+1];
        
        for(int []row : dp)
            Arrays.fill(row , -1);
        
        return eggDrop(egg , floor);  
    }
}