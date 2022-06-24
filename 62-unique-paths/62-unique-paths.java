class Solution {
    
    static int [][] dir = {{1 , 0} , {0 , 1}};
    
    public int helper (int sr , int sc , int dr , int dc , int[][]dp)
    {
        if(sr==dr && sc==dc)
            return 1;
        
        if(dp[sr][sc]!=0)
            return dp[sr][sc];
        
        int count=0;
        
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = sr + dir[d][0];
            int col = sc + dir[d][1];
            
            if(row<= dr && col<=dc && row>=0 && col>=0)
            {
               count+=helper( row , col , dr , dc , dp); 
            }
            
        }
        
        return dp[sr][sc]=count;
    }
    
    public int uniquePaths(int m, int n) 
    {
        int [][] dp = new int[m][n];
        return helper( 0 , 0 , m-1 , n-1 , dp);
    }
}