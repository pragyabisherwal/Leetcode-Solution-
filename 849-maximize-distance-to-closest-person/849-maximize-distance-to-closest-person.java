class Solution {
    public int maxDistToClosest(int[] seats) {
        
        int j=-1;
        int res=0;
        
        for(int i=0 ; i<seats.length ;i++)
        {
            if(seats[i]==1)
            {
               int ans=0;
                
                if(j<0)   //encountering one for the first time
                {
                   ans = i; 
                }
                
                else    // rest of the cases
                {
                    ans=(i-j)/2;
                }
                
                res = Math.max(ans , res);
                
               j=i;
            }
        }
        
        int ans = (seats.length-1)-j;  // case of zeroes in the end
        
        return Math.max(ans , res);
    }
}