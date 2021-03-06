class Solution {
    public int maximalSquare(char[][] matrix) 
    {
        int m = matrix.length;
        int n=matrix[0].length;
        int ans =0;
        
        int [][] dp = new int[m][n];
        
        for(int i=m-1 ; i>=0; i--)
        {
            for(int j=n-1 ; j>=0; j--)
            {
                if(i==m-1 || j==n-1)
                {
                    
                    dp[i][j]=matrix[i][j] - '0';
                }
                
                else
                {
                    if(matrix[i][j]=='0')
                        dp[i][j]=0;
                    
                    else
                    {
                        dp[i][j]=Math.min(dp[i][j+1],Math.min(dp[i+1][j],dp[i+1][j+1]))+1;
                        
                    }
                }
                
                System.out.println(dp[i][j]);
                if(dp[i][j]>ans)
                    ans=dp[i][j];
            }
        }
        
        return ans*ans;
        
        
    }
}