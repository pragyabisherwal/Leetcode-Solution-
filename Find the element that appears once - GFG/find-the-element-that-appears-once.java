// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        int lo=0;
        int hi=N-1;
        
        if(A.length==1)
         return A[0];
        
        if(A[lo]!=A[lo+1])
         return A[lo];
        
        else if(A[hi]!=A[hi-1])
         return A[hi];
        
        while(lo<=hi)
        {
            int mid =(lo+hi)/ 2;
            
            if(A[mid]!=A[mid+1] && A[mid]!=A[mid-1])
             return A[mid];
            
            else if((mid%2==0 && A[mid]==A[mid+1] )|| (mid%2!=0 && A[mid]==A[mid-1]))
            {
                lo=mid+1;
            }
            
            else
             hi=mid-1;
        }
        
        return -1;
    }
}