class Solution {
    
    public int countDigit(int n)
    {
        int num=0;
        
        while(n!=0)
        {
            int rem = n%10;
            
            if(num >Integer.MAX_VALUE/10 || num <Integer.MIN_VALUE/10)
                return 0;
            
            num = num*10+rem;
            n=n/10;
        }
        
       return num;
    }
    public int reverse(int x) 
    {
        
        int final_num = countDigit(x);
        return final_num;
    }
}