class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        for(int num : nums2)
        {
            while(!st.isEmpty() && st.peek()<num)
            {
                hm.put(st.peek() , num);
                st.pop();
            }
            
            st.push(num);
        }
        
        int [] results = new int[nums1.length];
        Arrays.fill(results , -1);
        
        for(int i=0 ; i<nums1.length ; i++)
        {
    
            int num = nums1[i];
            
            if(hm.containsKey(num))
             results[i]=hm.get(num);
        }
        
        return results;
    }
}