class Solution {
    
    public class Pair implements Comparable<Pair>
    {
        int i;
        int j;
        int tsf;
        
        Pair(){}
        
        Pair(int i , int j , int tsf){
            this.i=i;
            this.j=j;
            this.tsf=tsf;
        }
        
        public int compareTo(Pair o)
        {
            return this.tsf-o.tsf;
        }
    }
    
    static int [][] dir = {{-1,0} , {1,0}, {0,-1},{0,1}};
    
    public int swimInWater(int[][] grid) 
    {
        PriorityQueue<Pair> qu = new PriorityQueue<>();
        qu.add(new Pair(0,0,grid[0][0]));
   
       
        while(qu.size()>0)
        {
            Pair rem = qu.remove();   //remoove
            
            if(grid[rem.i][rem.j]==-1)  //mark
            {
                continue;
            }
            
            grid[rem.i][rem.j]=-1;
            
            if(rem.i==grid.length-1 && rem.j==grid[0].length-1)//work
                return rem.tsf;
            
            
            for(int d=0 ; d<dir.length ; d++)
            {
                int row=rem.i+dir[d][0];
                int col=rem.j+dir[d][1];
   
                if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]!=-1)
                {
                    qu.add(new Pair(row , col , Math.max(rem.tsf , grid[row][col])));
                }
            }
            
        }
        
        return -1;
    }
}