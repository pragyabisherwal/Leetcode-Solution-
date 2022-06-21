class Solution {
    public int maxProfit(int[] prices) 
    {
        int mpist=0;  // maximum profit if sold today
        int leastsf=prices[0];  // least so far
        
        int [] mpst=new int[prices.length]; // maximum profit store
        
        
        for(int i=1;i<prices.length;i++)
        {
           if(leastsf > prices[i])
               leastsf=prices[i];
            
            mpist=prices[i]-leastsf;
            
            if(mpist>mpst[i-1])
                mpst[i]=mpist;
            
            else
            {
              mpst[i]=mpst[i-1] ; 
            }
        }
        
        int mpibt=0;  // maximum profit if bought today
        int maxsf=prices[prices.length-1];  // max so far
        
        int [] mpstr=new int[prices.length]; // maximum profit store return
        
        
        for(int i=prices.length-2;i>=0;i--)
        {
           if(maxsf<prices[i])
               maxsf=prices[i];
            
            mpibt=maxsf-prices[i];
            
            if(mpibt > mpstr[i+1])
                mpstr[i]=mpibt;
            
            else
            {
              mpstr[i]=mpstr[i+1];
            }
        }
        
        
        int max=0;
        
        for(int i=0 ; i<prices.length ; i++)
        {
           if(mpst[i] + mpstr[i] > max)
               max=mpst[i] + mpstr[i];
        }
        return max;
        
        
        
    }
}