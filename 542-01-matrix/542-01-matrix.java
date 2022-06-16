class Solution {
    public class Pair
    {
        int i;
        int j;
        int level;
        
        Pair(){
        }
        
        Pair(int i , int j , int level)
        {
            this.i=i;
            this.j=j;
            this.level=level;
        }
    }
    
   static int [][] dir = {{-1,0} , {1,0}, {0,-1},{0,1}};
    

    public int[][] updateMatrix(int[][] mat) 
    {
        Queue<Pair> qu = new LinkedList();
        
        int [][] result = new int [mat.length][mat[0].length];
        
        for(int i=0 ; i<mat.length ; i++)
        {
            for(int j=0 ; j<mat[0].length ; j++)
            {
                if(mat[i][j]==0)
                    qu.add(new Pair(i , j , 0));
            }
        }
        
        while(qu.size()>0)
        {
            Pair rem = qu.remove();   //remoove
            
            if(mat[rem.i][rem.j]==-1)  //mark
            {
                continue;
            }
            
            mat[rem.i][rem.j]=-1;
            
            result[rem.i][rem.j]=rem.level; //work
            
            
            for(int d=0 ; d<dir.length ; d++)
            {
                int row=rem.i+dir[d][0];
                int col=rem.j+dir[d][1];
                
               
                
                if(row>=0 && col>=0 && row<mat.length && col<mat[0].length && mat[row][col]==1)
                {
                    qu.add(new Pair(row , col , rem.level+1));
                }
            }
            
        }
        
        return result;
        
    }
}