class Solution {
    public boolean hasGroupsSizeX(int[] deck) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int ch : deck)
            hm.put(ch , hm.getOrDefault(ch , 0) + 1);
        
        int res=0;
        
        for(int x : hm.keySet())
        {
            int count = hm.get(x);
            res=gcd(res , count);  
        }
        
        if(res>1)
             return true;
        
        else
            return false;
           
    }
    
    public static int gcd(int a , int b)
    {
        if(a%b== 0)
            return b;
        
        else
            return gcd(b , a%b);
    }
}