class Solution {
    public int maxProfit(int[] prices) {
        
        int minSoFar=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0 ; i<prices.length ; i++)
        {
           if(prices[i]<minSoFar)
               minSoFar=prices[i];
           
            int profit=prices[i]-minSoFar;
            
            if(maxProfit < profit)
                maxProfit = profit;
        }
        
        return maxProfit;
        
    }
}