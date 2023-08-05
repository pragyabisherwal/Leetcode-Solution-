class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int [] ans = new int[2];
        

        for(int i=0 ; i<nums.length ; i++)
        {
           int val = nums[i];
           int rem = target - val;
            
            if(hm.containsKey(rem))
            {
                ans[0]=i;
                ans[1]=hm.get(rem);
                
            }
            
             hm.put(nums[i] , i);
            
        }
        
        return ans;
        
        
        
    }
}