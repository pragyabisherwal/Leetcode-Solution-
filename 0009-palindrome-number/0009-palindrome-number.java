class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x==0)
            return true;
        
        if(x<0)
            return false;
        
        if(x%10==0)
            return false;
        
        int n = x;
        int num=0;
        
        while(n!=0)
        {
            int rem = n%10;
            
            if(num >Integer.MAX_VALUE/10 || num < Integer.MIN_VALUE/10)
                return false;
            
            num = num*10 + rem;
            n=n/10;
        }
        
        if(num == x)
            return true;
        
        else
            return false;
        
            
    }
}