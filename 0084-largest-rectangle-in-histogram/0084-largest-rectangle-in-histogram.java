class Solution {
    
    public int[] nsor( int[] heights)
    {
        Stack<Integer> st = new Stack<>();
        int []result = new int[heights.length];
        Arrays.fill(result , heights.length);
        
        for(int i=0 ; i<heights.length ; i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>heights[i])
            {
                result[st.peek()]=i;
                st.pop();
            }
            
            st.push(i);
        }
        
        return result;
    }
    
    public int[] nsol( int[] heights)
    {
        Stack<Integer> st = new Stack<>();
        int []result = new int[heights.length];
        Arrays.fill(result , -1);
        
        for(int i=heights.length-1 ; i>=0 ; i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>heights[i])
            {
                result[st.peek()]=i;
                st.pop();
            }
            
            st.push(i);
        }
        
        return result;
    }
    public int largestRectangleArea(int[] heights) {
        
        int[] nsor = nsor(heights);
        int[] nsol = nsol(heights);
        
        int maxArea=0;
        
        for(int i=0 ; i<heights.length; i++)
        {
            int left = nsol[i];
            int right = nsor[i];
            
            int area= heights[i] * (right - left -1);
            
            if(area>maxArea)
                maxArea=area;
        }
        
        return maxArea;
        
    }
}