class Solution {
    public int maxProfit(int[] prices, int fee) 
    {
        int ossp=0;
        int obsp=-prices[0];
        
        for(int i=1;i<prices.length;i++)
        {
            int nssp=0;
            int nbsp=0;
            
           if(ossp - prices[i] > obsp)   
           {   
               nbsp=ossp - prices[i];
           }
            
           else
           {
               nbsp=obsp;
           }
            
           if(prices[i] - fee + obsp > ossp)
           {
               nssp=prices[i] - fee + obsp;
           }
            
           else
           {
               nssp=ossp;
           }
            
            ossp=nssp;
            obsp=nbsp;
            
        }
        
        return ossp;
        
    }
}