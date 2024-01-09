class Solution {
    public boolean checkPerfectNumber(int num) {
        
        if(num == 1)
            return false;
        
        int n = num;
        int check = 1;
    
        
        for(int i=2 ; i<=num/2 ; i=i+1)
        {
            if(num%i==0)
                check+=i;
            
            //System.out.println(check);
        }
        
        if(check==n)
            return true;
        
        else
            return false;
    }
}