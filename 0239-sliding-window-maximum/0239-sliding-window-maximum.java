class Solution {
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int n = nums.length;
        Deque<Integer> qu = new ArrayDeque<Integer>();
        int i , j=0;
        int [] res = new int[n-k+1]; 
        
        for(i=0 ; i<k ; i++)
        {
          while(!qu.isEmpty() && nums[i]>=nums[qu.peekLast()])  
              qu.removeLast();
        
          qu.addLast(i);
        }
        
        for(; i<n ; i++)
        {
           res[j++]= nums[qu.peek()];
           
        
           while(!qu.isEmpty() && qu.peek()<=i-k)  
              qu.removeFirst();
            
            
            while(!qu.isEmpty() && nums[i]>=nums[qu.peekLast()])  
              qu.removeLast();
            
            qu.addLast(i);
        }
        
        res[j++]= nums[qu.peek()];
        return res;
    }
}