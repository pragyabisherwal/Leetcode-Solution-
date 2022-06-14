class Solution {
    static int [][] dir = {{-1,0} , {1,0}, {0,-1},{0,1} };
    
    boolean flag=true;
    int len=0;
    
    public void countEnclaves(int[][] grid , int i , int j)
    {
        grid[i][j]=0;
        
        if(i == 0 || j== 0 || i == grid.length-1 || j== grid[0].length-1)
            {
                flag = false;
                return;
            }
         len=len+1;
 
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = i + dir[d][0];
            int col = j + dir[d][1];
            
 
            if(row >= 0 && col>= 0 && row <= grid.length-1 && col<= grid[0].length-1 && grid[row][col]==1)
            {
               countEnclaves(grid , row, col); 
            }
            
        }
    }
    public int numEnclaves(int[][] grid) 
    {
        int count=0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=1; i<m-1; i++)
        {
            for(int j=1;j<n-1;j++)
            {
                if(grid[i][j]==1)
                {
                    len=0;
                    flag=true;
                    
                    countEnclaves(grid , i , j);
                    if(flag==true)
                    {
                        
        
                        count+=len;
                    }
                    
                }
                
            }
        }
        
        return count;
        
    }
}