class Solution {
    public int minPathSum(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        
        int [][] dp = new int [m][n];
        
        
        for(int i=m-1 ; i>=0 ; i--)
        {
            for(int j=n-1 ; j>=0 ; j--)
            {
               if(i==m-1 && j==n-1)
                    dp[i][j]=grid[i][j];
                   
                
               else if(i==m-1)
               {
                  dp[i][j]=grid[i][j]+dp[i][j+1];
               }
                
                else if(j==n-1)
                {
                  dp[i][j]=grid[i][j]+dp[i+1][j]; 
                     
                }
                
                else
                {
                     int ans1=grid[i][j]+dp[i][j+1];
                     int ans2=grid[i][j]+dp[i+1][j];
                     dp[i][j]=Math.min(ans1 , ans2);
                }
                
               
            }
        }
        
        return dp[0][0];
        
        
    }
}