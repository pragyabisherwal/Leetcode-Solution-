class Solution {
    
    static boolean solve(char[][] board)
    {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean noEmptyLeft = true;
        
        
       for(int i=0;i<n;i++)
       {
            for(int j=0;j<n;j++)
            {
                //Found an empty block
                if(board[i][j]=='.')
                {
                    row = i;
                    col = j;
                    noEmptyLeft = false;
                    break;
                }
            }
           
           //All the blocks are filled
            if(!noEmptyLeft)
                break;
        }
        
        //solved completely
        if(noEmptyLeft)
            return true;
        

        
        for(int number = 1;number<=9;number++)
        {
            if(isSafe(board,row,col,number))
            {
                board[row][col]= (char)(number +'0');
                
                if(solve(board))
                {
                    return true;
                }
                
                //Backtrack
                else
                {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    
    public static boolean isSafe(char[][] board,int row,int col,int num)
    {

        for(int i=0;i<board.length;i++){
            if(num == (board[row][i]-'0')){
                return false;
            }
        }

        for(int i=0;i<board.length;i++){
            if(num == (board[i][col]-'0')){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = (row/3 )* 3;
        int colStart = (col/3 )* 3; 

        for(int i=rowStart;i<rowStart+3;i++)
        {
            for(int j=colStart;j<colStart+3;j++)
            {
                if((char)(num + '0') == board[i][j])
                    return false;
            }
        }

        return true;
   }
    
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}