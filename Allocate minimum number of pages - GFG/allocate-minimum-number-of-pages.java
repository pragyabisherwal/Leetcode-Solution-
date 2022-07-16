// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static boolean isAllocated(int[]A,int N,int M , int mid)
    {
        int pageSum=0;
        int student=1;
        
        for(int i=0 ; i<N ; i++)
        {
            if(pageSum+A[i]<=mid)
            {
                pageSum+=A[i];
            }
            
            else
            {
                student++;
                
                if(student>M || A[i]>mid)
                   return false;
                   
                pageSum=A[i];
            }
        }
        
        return true;
        
    }
    public static int findPages(int[]A,int N,int M)
    {
       int lo=0;
       int hi=0;
       int ans=-1;
       
       for(int i=0 ; i<N ; i++)
       {
           hi+=A[i];
       }
       
       while(lo<=hi)
       {
           int mid = lo+(hi-lo)/2;
           
           if(isAllocated(A , N , M , mid))
           {
               ans = mid;
               hi=mid-1;
           }
           
           else
           {
               lo=mid+1;
           }
       }
       
       return ans;
    }
};