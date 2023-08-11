class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
     
        if(matrix.length==0)
            return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int lo=0;
        int hi=m-1;
        
        while(lo<n && hi>=0)
        {
           
            if(matrix[lo][hi]==target)
            {
               return true; 
            }
            
            else if(matrix[lo][hi]>target)
            {
                hi--;
            }

            else 
            {
                lo++;
            }
              
        }
        
        return false;
    }
}