// { Driver Code Starts

import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int [] length = new int[n];
        
        int len =1;
        for(int i=0;i<n ; i++)
        {
            length[i]=len;
            len++;
        }
        
        int [][] dp = new int[n+1][n+1];
        
        for(int i=0 ; i<dp.length ; i++)
        {
            for(int j=0 ; j<dp[0].length ; j++)
            {
                if(j==0 || i==0)
                  dp[i][j]=0;
                
                else if(j<length[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                }
            }
        }
        
        return dp[n][n];
    }
}