class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n = nums.length;
        int [] ans = new int[n-k+1];
        int i=0 , j=0 , m=0;
        
        Deque<Integer> dq = new LinkedList<>();
        
        while(j<n)
        {
            while(!dq.isEmpty() && dq.getLast()<nums[j])
                dq.removeLast();
            
            dq.add(nums[j]);
            
            if(j-i+1 < k)
                j++;
            
            else if(j-i+1 == k)
            {
                ans[m]=dq.getFirst();
                
                
                if(dq.getFirst()==nums[i])
                    dq.removeFirst();
                
                i++;
                j++;
                m++;
            }
        }
        
        return ans;
    }
}