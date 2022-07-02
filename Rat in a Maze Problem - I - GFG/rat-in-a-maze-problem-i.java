// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    static int [][] dir = { {1 , 0} ,  {0 , -1} ,  {0 , 1} , {-1 , 0} };
    static String [] dirN = {"D" , "L" , "R", "U"};
    
    public static void helper(int[][] m,int sr , int sc , int dr , int dc , String psf , ArrayList<String> st , int vis[][])
    {
        if(sr==dr && sc==dc)
         {
            st.add(psf);
            return;
         }
         
        for(int d=0 ; d<dir.length ; d++)
        {
            int row = sr + dir[d][0];
            int col = sc + dir[d][1];
          
            if(row>=0 && col>=0 && row<=dr && col<=dc && m[row][col]==1 && vis[row][col]==0)
            {
                vis[sr][sc]=1;
                helper(m , row , col , dr , dc , psf+dirN[d] , st , vis);
                vis[sr][sc]=0;
            }
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) 
    {
       ArrayList<String> st = new ArrayList <> ();
       
       int vis[][] = new int[n][n];
       
        // for(int i = 0;i<n;i++) {
        //     for(int j = 0;j<n;j++) {
        //         vis[i][j] = 0; 
        //     }
        // }
       
       if(m[0][0]==1)
        helper(m , 0 , 0 , n-1, n-1, "" , st , vis);
        
       return st;
    }
}