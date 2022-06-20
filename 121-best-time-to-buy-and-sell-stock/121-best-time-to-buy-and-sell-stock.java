class Solution {
    public int maxProfit(int[] prices) 
    {
        int lsf=Integer.MAX_VALUE;
        int finalProfit=0;
        
        for(int i=0 ; i<prices.length ; i++)
        {
            if(prices[i]<lsf)
                lsf=prices[i];
            
            int profit=prices[i]-lsf;
            
            if(profit>finalProfit)
                finalProfit=profit;
                
        }
        
        return finalProfit;
        
    }
}