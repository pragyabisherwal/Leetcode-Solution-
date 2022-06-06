class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int [] ans = new int[2];
        HashMap<Integer , Integer> hm = new HashMap<> ();
    
        
        for(int i=0 ; i<nums.length ; i++)
        {
            int val = nums[i];
            int rem = target - val;
            
            if(hm.containsKey(rem))
            {
                ans[0]=i;
                ans[1]=hm.get(rem);
                
                return ans;
            }
            
            hm.put(val , i);
            
        }
        
        return ans;
        
    }
}