class Solution {
    public int consecutiveNumbersSum(int n) 
    {
        int k=1;
        int check = k*(k-1)/2;
        int result=0;
        
        while(check<n)
        {
            if((n-check)%k==0)
            {
                result++;
            }
            
            k++;
            
           check = k*(k-1)/2;  
        }
        
        return result;
    }
}