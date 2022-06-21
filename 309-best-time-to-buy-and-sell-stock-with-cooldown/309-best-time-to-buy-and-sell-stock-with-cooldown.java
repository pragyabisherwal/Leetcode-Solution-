class Solution {
    public int maxProfit(int[] prices) 
    {
        int ossp=0;
        int ocdp=0;
        int obsp=-prices[0];
        
        for(int i=1 ; i<prices.length ; i++)
        {
            int nbsp=0;
            int ncdp=0;
            int nssp=0;
            
            if(ocdp-prices[i] > obsp)
            {
                nbsp=ocdp-prices[i];
            }
            else
            {
                nbsp=obsp;
            }
            
            if(prices[i] + obsp > ossp)
            {
                nssp=prices[i] + obsp;
            }
            
            else
            {
               nssp=ossp; 
            }
            
            if(ossp > ocdp)
            {
                ncdp=ossp;
            }
            else
            {
                ncdp=ocdp;
            }
            
            obsp=nbsp;
            ocdp=ncdp;
            ossp=nssp;
        }
        
        return ossp;
        
    }
}