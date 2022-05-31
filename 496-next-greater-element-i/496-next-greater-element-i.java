class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        int [] result = new int[n];
        
        Arrays.fill(result , -1);
        Stack < Integer> st = new Stack <> ();
        
        for(int i:nums2)
        {
            while(st.size()!=0 && st.peek()<i)
            {
                map.put(st.peek() , i);
                st.pop();
            }
            
            st.push(i);
        }
        
        for(int j=0 ; j<n ; j++)
        {
            if(map.containsKey(nums1[j]))
            {
                result[j]=map.get(nums1[j]);
            }
            
            else
                result[j]=-1;
        }
        
        return result;
        
    }
}