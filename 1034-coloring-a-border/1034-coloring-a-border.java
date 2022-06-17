class Solution {
    
    public class pair
    {
        int i;
        int j;
        boolean isBorder;
        
        pair(){}
        
        pair(int i ,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    
     static int [][] dir = {{-1,0} , {1,0}, {0,-1},{0,1}};
    
    public int[][] colorBorder(int[][] grid, int row, int col, int color) 
    {
        Queue <pair> qu = new LinkedList ();
        
        pair p = new pair(row , col);
        p.isBorder=checkBorder(grid , row , col);
        qu.add(p);
        
        int orgc=grid[row][col];
        
        List <pair> li = new ArrayList<> ();
       boolean [][] vis = new boolean [grid.length][grid[0].length];
        
        while(qu.size()>0)
        {
            pair rem= qu.remove();
            
            if(vis[rem.i][rem.j])
                continue;
            
            vis[rem.i][rem.j]=true;
            
            if(rem.isBorder)
                li.add(rem);
            
          
            for(int d=0 ; d<dir.length ; d++)
            {
                int r=rem.i+dir[d][0];
                int c=rem.j+dir[d][1];
   
                if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==orgc && vis[r][c]==false)
                {
                   pair pnew = new pair(r , c);
                   pnew.isBorder=checkBorder(grid , r , c);
                   qu.add(pnew);
                }
            }
            
            
        }
        
        for(pair rem : li)
        {
            grid[rem.i][rem.j]=color;
        }
        
        return grid;
    }
    
    public boolean checkBorder(int[][] grid, int row, int col)
    {
        if(row==0)
            return true;
        
        else if(col==0)
            return true;
        
        else if(row==grid.length-1)
            return true;
        
        else if(col==grid[0].length-1)
            return true;
        
        else
        {
            if(grid[row-1][col]!=grid[row][col])
                return true;
            
            else if(grid[row+1][col]!=grid[row][col])
                return true;
                   
            else if(grid[row][col-1]!=grid[row][col])
                return true;
            
            else if(grid[row][col+1]!=grid[row][col])
                return true;
            else
                return false;
        }
    }
}