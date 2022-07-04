// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        data = x;
        left = right = null;
    }
}
class Solution
{
     
    int [] result;
    int idx=0;
    
    public Node createBST(int n, int []nums , int start , int end)
    {
        if(start>end)
         return null;
         
        int mid =start + (end - start)/2;
        int val = nums[mid];
        
        Node myAns = new Node(val);
        
        myAns.left=createBST(n , nums , start , mid-1);
        myAns.right=createBST(n , nums , mid+1 , end);
        
        return myAns;
        
    }
    
    public void preorder(Node root)
    {
        if(root==null)
         return;
        
        result[idx++]=root.data;
        preorder(root.left);
        preorder(root.right);
        
    }
    public int[] sortedArrayToBST(int[] nums)
    {
       int n = nums.length;
       Node root=createBST(n , nums , 0 , n-1);
       
       result=new int[n];
       preorder(root);
       
       return result;
    }
}