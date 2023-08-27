class Solution {
    public int getLucky(String s, int k) {
        
       int ans=0;
       for(int i=0 ; i<s.length();i++)
        {
           int num = (s.charAt(i)-'a')+1;
           
           if(num>=10)
           {
               ans +=num%10;
               ans +=num/10;
           }
           
           else
            ans=ans+num;
        }
        
        if(k==1)
            return ans;
        
        int sum=0;
    
        while(k-1>0)
        {
            sum=0;
            while(ans>0)
            {
                int n = ans%10;
                ans = ans/10; 
                
                sum+=n;
            }
            
            ans=sum;
            k--;
        }
        
        return sum;
    }
}