class Solution {
    public int mySqrt(int x) 
    {
        if(x==0)
            return 0;
        
        int start=1 , end=x;
        
        while(start<=end)
        {
            long mid = start + (end-start)/2;
            long val = mid*mid;
            
            if(val > x)
              end = (int)mid-1;
            
            else if(val<=x)
                start = (int)mid+1;
        }
        
        return (int)end;
    }
}