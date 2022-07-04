// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    int [][] dir = {{0,1} , {0,-1} , {1,0} , {-1,0} , {1,1} , {1,-1} , {-1,-1} , {-1,1}};
    
    public void countIslandSpread(char[][]grid , int i , int j)
    {
        grid[i][j]='0';
        
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = i + dir[d][0];
            int col = j+ dir[d][1];
            
            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]=='1')
            {
               countIslandSpread(grid , row , col); 
            }
        }
    }
    public int numIslands(char[][] grid) 
    {
        int count = 0;
       
       for(int i=0 ; i<grid.length ; i++)
       {
           for(int j=0 ; j<grid[0].length ; j++)
           {
               if(grid[i][j]=='1')
               {
                   count++;
                   countIslandSpread(grid , i , j);
                   
               }
           }
       }
       
       return count;
    }
}