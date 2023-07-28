//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    public static long[] nsor(long[] heights)
    {
        int n = heights.length;
        
        long [] result = new long[n];
        Arrays.fill(result , n);
        
        Stack<Integer>st= new Stack<>();
        
        for(int i=0 ; i<n ; i++)
        {
            
            while(st.size()!=0 && heights[st.peek()]>heights[i])
            {
                result[st.peek()]=i;
                st.pop();
            }
            
            st.push(i);
        }
        
        return result;
    }
    
    public static long[] nsol(long[] heights)
    {
        int n = heights.length;
        
        long []result = new long[n];
        Arrays.fill(result , -1);
        
        Stack<Integer>st= new Stack<>();
        
        for(int i=n-1; i>=0 ; i--)
        {
            
            while(st.size()!=0 && heights[st.peek()]>heights[i])
            {
                result[st.peek()]=i;
                st.pop();
            }
            
            st.push(i);
        }
        
        return result;
    }
    
    
    public static long getMaxArea(long heights[], long n) 
    {
        long []nsr=nsor(heights);
        long []nsl=nsol(heights);
        
        long max=0;
        
        for(int i=0 ; i<heights.length ; i++)
        {
            long right=nsr[i];
            long left=nsl[i];
            
            long area = heights[i]*(right-left-1);
            
            if(area>max)
                max=area;
            
        }
        
        return max;
    }
        
}



