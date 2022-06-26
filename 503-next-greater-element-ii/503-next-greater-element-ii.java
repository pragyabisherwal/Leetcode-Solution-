class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length;
        
        int [] result = new int[n];
        Arrays.fill(result , -1);
        
        Stack < Integer> st = new Stack();
        
        for(int i=0 ; i<2*n-1 ; i++)
        {
            while(st.size()!=0 && nums[st.peek()] < nums[i%n])
            {
               result[st.peek()] =nums[i%n];
               st.pop();
            }
           
             if(i<n)
                {
                     st.push(i);
                }
           
        }
        
        return result;
    }
}