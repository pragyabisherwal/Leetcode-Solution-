class Solution {
    public int maxProfit(int[] prices) 
    {
        int bd=0;
        int sd=0;
        
        int maxProfit=0;
        
        for(int i=1 ; i<prices.length ; i++)
        {
            if(prices[i]>=prices[i-1])
                sd++;
            
            else
            {
               maxProfit+=prices[sd]-prices[bd];
                sd=bd=i;
            }
        }
        
        maxProfit+=prices[sd]-prices[bd];
        return  maxProfit;
        
    }
}