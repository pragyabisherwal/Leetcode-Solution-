class Solution {
    
    List<List<String>> result = new ArrayList<List<String>>();
    
    public List<List<String>> solveNQueens(int n) 
    {
        boolean [] cols = new boolean[n];
        boolean [] ndiag = new boolean[2*n - 1];
        boolean [] rdiag = new boolean[2*n -1 ];
        boolean [][] board = new boolean[n][n];
        
        solve(0, cols , ndiag , rdiag , board , n);
        return result;
        
    }
    
    public void solve(int row , boolean [] cols , boolean [] ndiag  , boolean [] rdiag ,boolean [][] board , int n)
    {
        if(row == board.length)
        {
            List<String> ans = new ArrayList<> ();
            for(int i = 0; i < n; i++)
           {
             String res = "";
            for(int j = 0; j < n; j++)
            {
                if(board[i][j] == false)
                {
                    res= res + ".";
                }
                else
                {
                    res= res + "Q";
                }
            }
           ans.add(res);
        }
        result.add(ans);
        }
        
        for(int col=0 ; col<board[0].length ; col++)
        {
            
            if(cols[col]==false && ndiag[row+col]==false && rdiag[row - col + board[0].length-1]==false)
            {
                board[row][col]=true;
                cols[col]=true;
                ndiag[row+col]=true;
                rdiag[row - col + board[0].length-1]=true;
                
                solve(row+1 , cols , ndiag , rdiag , board , n);
                    
                board[row][col]=false;
                cols[col]=false;
                ndiag[row+col]=false;
                rdiag[row - col + board[0].length-1]=false;
                
                
            }
        }
    }
}