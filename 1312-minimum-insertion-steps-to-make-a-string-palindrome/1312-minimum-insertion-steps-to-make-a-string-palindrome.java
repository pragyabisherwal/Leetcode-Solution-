class Solution {
    public int minInsertions(String s1) 
    {
        StringBuilder sb=new StringBuilder(s1);  
        sb.reverse();  
        String s2=sb.toString();
        
        int x = s1.length();
        int y = s2.length();
        
        int [][] dp = new int[x+1][y+1];
        
     
     for(int i=0 ; i<dp.length; i++)
     {
         for(int j=0; j<dp[0].length ; j++)
         {
             
             
             if(i==0 || j==0)
            {
                dp[i][j]=0;
                continue;
            }
            
            char ch1 = s1.charAt(i-1);
            char ch2 = s2.charAt(j-1);
             
            if(ch1==ch2)
             {
                dp[i][j]= 1+dp[i-1][j-1]; 
             }
             
             else
             {
                dp[i][j]=Math.max(dp[i-1][j] , dp[i][j-1]); 
             }
          
         }
     }
     
     return (x-dp[x][y]);
    }
}