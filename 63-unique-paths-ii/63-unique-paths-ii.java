class Solution {
    
    static int[][] dir = {{0,1} , {1,0}};
    
    public boolean inRange(int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m)
            return false;
        return true;
    }
    
    public int helper(int[][] obstacleGrid , int sr , int sc , int dr , int dc,int[][]dp )
    {
        if(sr==dr && sc==dc)
        {
           return dp[sr][sc]=1; 
        }
        
        if(dp[sr][sc]!=0)
        {
            return dp[sr][sc];
        }
        
        int count=0;
        
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = sr + dir[d][0];
            int col = sc + dir[d][1];
            
            if(inRange(row , col , dr+1 , dc+1) && obstacleGrid[row][col]==0)
            {
                count+= helper(obstacleGrid , row, col ,dr ,dc,dp);
            }
        }
        
        
        return dp[sr][sc]=count;
        
        
        
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        if(n==0 || m==0)
            return 0;
        
        if(obstacleGrid[0][0]==1 || obstacleGrid[n-1][m-1]==1)
             return 0;
        
        int [][]dp = new int[n][m];
        
        int result=helper(obstacleGrid , 0 , 0 ,n-1 , m-1,dp);
        return result;
        
    }
}