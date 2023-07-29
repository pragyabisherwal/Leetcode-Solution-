//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    static int [] nextGreater(int arr[] , int n)
    {
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        Arrays.fill(res , n);
        st.push(n-1);
        
        for(int i=n-2 ; i>=0 ; i--)
        {
            while(st.size()>0 && arr[st.peek()] <= arr[i])
             st.pop();
            
            if(st.size()>0 && arr[st.peek()] > arr[i])
             res[i] = st.peek();
            
            st.push(i);
        }
        
        return res;
    }
    
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int [] nge = nextGreater(arr , n);
        ArrayList <Integer> al = new ArrayList<>();
        
        int j=0 ;
        
       for(int i=0 ; i<=n-k ; i++)
       {
           if(j<i)
            j=i;
           
           while(nge[j] < i+k)
            j = nge[j];
            
           al.add(arr[j]);
       }
       
       
        return al;
    }
}