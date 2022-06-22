class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> hm = new HashMap<> ();
        int result=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(hm.containsKey(nums[i])==false)
            {
                hm.put(nums[i] , 1);
            }
            
            else if(hm.containsKey(nums[i])==true)
            {
                result = nums[i];
                break;
            }
        }
        
        return result;
        
        
        
        
        
    }
}