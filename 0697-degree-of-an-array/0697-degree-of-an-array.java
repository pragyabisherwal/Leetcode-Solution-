class Solution {
    public int findShortestSubArray(int[] nums) 
    {
        HashMap<Integer, int[]> m = new HashMap<>();
        int max = 0;
        int res = 0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            int a = nums[i];
            
            if(!m.containsKey(a))
            {
                m.put(a, new int[]{i,i,1});
                
                if(max == 0)  // Maximum Frequency
                    max = 1;
               
                if(res == 0)  //Length of the subarray
                    res = 1;
            }
            
            else
            {
                int []x = m.get(a);
                x[1] = i;
                x[2]++;
                
                if(x[2]>max)
                {
                    max = x[2];
                    res = i-x[0]+1;
                }
                else if(x[2] == max)
                {
                    res = Math.min(res, i-x[0]+1);
                }
            }
        }
          return res;
    }
}