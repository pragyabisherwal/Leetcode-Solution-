class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int [] result = new int[n];
        
        for(int i=0 ; i<n ; i++)
        {
            int num = temperatures[i];
            
            while(!st.isEmpty() && temperatures[st.peek()]<num)
            {
                result[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        
        return result;
    }
}