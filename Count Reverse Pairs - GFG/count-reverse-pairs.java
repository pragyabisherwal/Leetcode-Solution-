//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int res = obj.countRevPairs(N, arr);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public  int ans;
    
    public int countRevPairs(int N, int arr[]) {
        ans=0;
        helper(arr , 0 , N-1);
        
        return ans;
    }
    
    public void helper(int [] nums , int lo , int hi)
    {
        if(lo<hi)
        {
            int mid = lo + (hi-lo)/2;
            helper(nums , lo , mid);
            helper(nums,mid+1 , hi);
            
            int i=lo;
            int j=mid+1;
            
           while(i<=mid && j<=hi)
           {
               if((long)nums[i] > (long)2*nums[j])
               {
                   j++;
                   ans= ans + mid-i+1;
               }
               
               else
               {
                   i++;
               }
           }
            
            Arrays.sort(nums , lo , hi+1);
        }
            
    }
    

}
