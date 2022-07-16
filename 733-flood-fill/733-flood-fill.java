class Solution {
    
    int [][] dir = {{-1,0} , {1,0} , {0,1} , {0,-1}};
    
    public void dfs(int[][] image, int sr, int sc, int color) 
    {
        int colorCurr=image[sr][sc];
        
        image[sr][sc]=color;
        
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = sr+dir[d][0];
            int col = sc+dir[d][1];
            
            if(row>=0 && col>=0  && row<image.length && col<image[0].length && image[row][col]==colorCurr)
            {
                dfs(image , row , col , color);
            }
            
        }
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        if(image[sr][sc]==color)
            return image;
        
        dfs(image , sr , sc , color);
        
        return image;
    }
}