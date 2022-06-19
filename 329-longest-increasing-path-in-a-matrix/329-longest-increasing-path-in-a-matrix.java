class Solution {
    int [][] dir = {{-1 , 0} , {1 , 0} , {0,-1} , {0,1}};
    
    public int dfs(int[][] matrix , int m , int n , int i , int j ,  int [][] dp)
    {
        if(dp[i][j]!=0)
            return dp[i][j];
        
        int max=0;
        
        for(int d=0 ; d<dir.length ; d++)
        {
            int row=i+dir[d][0];
            int col=j+dir[d][1];
            
            if(row>=0 && col>=0 && row<m && col<n && matrix[row][col]>matrix[i][j])
              max=Math.max(max , dfs(matrix , m , n , row , col , dp) );
        }
        
        
        return dp[i][j]=max+1;
    }
    
    public int longestIncreasingPath(int[][] matrix) 
    {
        if(matrix==null || matrix.length==0)
            return 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int longestIncPath=0;
        int [][] dp = new int[m][n];
        
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0; j<n ; j++)
            {
                int path=dfs(matrix,m , n , i , j , dp);
                
                longestIncPath=Math.max(longestIncPath , path);
                
            }
        }
        
        return longestIncPath;
        
    }
}