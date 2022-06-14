class Solution {
    static int [][] dir = {{1,0}, {0,1}, {-1,0} , {0,-1} };
    
    public void islandCount(char[][] grid , int i , int j)
    {
        grid[i][j]='0';
        
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = i+ dir[d][0];
            int col = j+ dir[d][1];
            
            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]=='1')
              islandCount(grid , row , col);
        }
        
    }
    public int numIslands(char[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        
        int count=0;
        
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    islandCount(grid , i , j);
                }
            }
        }
        
        return count;
    }
}