class Solution {
    
    static int [][] dir = {{1,0} , {0,1} , {-1, 0} , {0,-1}};
    
    public void countIslands(char[][] grid, int i , int j)
    {
        
        grid[i][j]='0';
        
        for(int k=0 ; k<dir.length ; k++)
        {
            int row = i+dir[k][0];
            int col = j+dir[k][1];
            
            if(row<grid.length && col<grid[0].length && row>=0 && col>=0 && grid[row][col]=='1')
             countIslands(grid , row, col);
        }
        
        
    }
    
    public int numIslands(char[][] grid) 
    {
        int count=0;
        
        for(int i=0 ; i<grid.length ; i++)
        {
            for(int j=0 ; j<grid[0].length ; j++)
            {
                if(grid[i][j]=='1')
                {
                     count++;
                     countIslands(grid , i , j);
                }
                   
            }
        }
        
        return count;
        
        
    }
}