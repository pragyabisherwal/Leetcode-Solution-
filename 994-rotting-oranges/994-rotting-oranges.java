class Solution {
    static int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    
    public class pair
    {
        int x;
        int y;
        int t;
        
        pair()
        {}
        pair(int x , int y , int t)
        {
            this.x=x;
            this.y=y;
            this.t=t;
        }
        
    }
    public int orangesRotting(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int fresh=0;
        
        boolean[][] vis= new boolean[m][n];
        Queue <pair> qu = new LinkedList ();
        
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(grid[i][j]==2)
                {
                    qu.add(new pair(i , j , 0));
                }
                
                else if(grid[i][j]==1)
                    fresh++;
            }
        }
        
        int time=0;
        
        while(qu.size()>0)
        {
            pair rem = qu.remove();
            
            if(vis[rem.x][rem.y])
                continue;
            
            vis[rem.x][rem.y]=true;
            
            if(rem.t>time)
                time=rem.t;
            
            if(grid[rem.x][rem.y]==1)
                fresh--;
            
            for(int d=0 ; d<dir.length ; d++)
            {
                int row = rem.x+dir[d][0];
                int col = rem.y+dir[d][1];
                
                if(row>=0 && col>=0 && row<m && col<n && grid[row][col]==1)
                    qu.add(new pair(row, col , rem.t+1));
                
            }
            
            
            
        }
        
        if(fresh==0)
            return time;
        
        else
            return -1;
        
    }
}