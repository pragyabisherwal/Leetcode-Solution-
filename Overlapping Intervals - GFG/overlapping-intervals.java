//{ Driver Code Starts
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
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] intervals)
    {
        Arrays.sort(intervals , (a , b)->{
            return a[0]-b[0];
        });
        
        Stack <int[]> st = new Stack<> ();
        st.push(intervals[0]);
        
        for(int i=1 ; i<intervals.length ; i++)
        {
            int s1=intervals[i][0];
            int e1=intervals[i][1];
            
            int [] t = st.pop();
            int s2 = t[0];
            int e2 = t[1];
            
            int max = Math.max(e1 , e2);
            
            if(e2>=s1)
            {
                int [] l = {s2 , max};
                st.push(l);
            }
            
            else
            {
                st.push(t);
                st.push(intervals[i]);
            }
        }
        
        int[][]result = new int[st.size()][2];
            
        for(int i=result.length-1 ; i>=0 ; i--)
        {
            int []t = st.pop();
            result[i][0]=t[0];
            result[i][1]=t[1];
                
        }
        
        return result;
        
    }
}