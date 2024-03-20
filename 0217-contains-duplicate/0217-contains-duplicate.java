class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        for(int num : nums)
        {
            if(hm.containsKey(num))
                return true;
            
            hm.put(num , hm.getOrDefault(num , 0)+1);
        }
        
        return false;
    }
}