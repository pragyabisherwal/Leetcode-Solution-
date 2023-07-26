class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans=0;
        
        for(int i=0 ; i<n ; i++)
            Arrays.sort(grid[i]);
        
        for(int j=0 ; j<m ; j++)
        {
            int max=Integer.MIN_VALUE;
            
            for(int i=0 ; i<n ; i++)
            {
               if(grid[i][j]>max)
                   max=grid[i][j];
            }
            
            ans=ans+max;
        }
        
        return ans;
        
    }
}