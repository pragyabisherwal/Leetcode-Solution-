class Solution {
    public void transpose(int[][] matrix)
    {
        for(int i=0 ; i<matrix.length ; i++)
        {
            for(int j=i ; j<matrix[0].length ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    
    public void reverse(int[] row)
    {
       int i=0;
       int j=row.length-1;
        
        while(i<j)
        {
            int temp=row[i];
            row[i]=row[j];
            row[j]=temp;
            
            i++;
            j--;
        }
    }
    
    public void rotate(int[][] matrix) 
    {
        transpose(matrix);
        
        for(int [] row : matrix)
        {
            reverse(row);
        }
        
    }
}