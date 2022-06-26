class Solution {
    public int [] nextGreater(int [] nums)
    {
        int [] nge = new int[nums.length];  // Next greater element
        
        Stack <Integer> st = new Stack(); // Indexes of array elements
        
        st.push(nums.length-1);
        nge[nums.length-1]=nums.length;

        for(int i=nums.length-2 ; i>=0 ; i--)
        {
            while(st.size()!=0 && nums[st.peek()]<=nums[i])
                st.pop();     //1 6 2 3
            
            if(st.size()==0)
            {
                nge[i]=nums.length;
            }
            
            else
            {
                nge[i]=st.peek();
            }
            
            st.push(i);
            
        }
        
        return nge;
    }
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int [] nge = nextGreater(nums);
        
        int [] result = new int[nums.length-k+1];
        
        for(int i=0 ; i<=nums.length-k ; i++)
        {
            //1,3,-1,   -3,5,3,6,7
           // i
          //    j
            
            int j=i;
            while(nge[j]<i+k)
            {
                j=nge[j];
            }
            
            result[i]=nums[j];
        }
        
        
        return result;
        
    }
}