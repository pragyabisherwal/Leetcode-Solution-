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
        int [][] dp = new int [n+1][n+1];
        
        // int [] len = new int[n];
        
        // for(int i=0 ; i<n ; i++)
        // {
        //     len[i]=i+1;
        // }

        for(int i=1; i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(i<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j] , price[i-1]+dp[i][j-i]);
                }
                
                else
                {
                  dp[i][j]=  dp[i-1][j];
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
}