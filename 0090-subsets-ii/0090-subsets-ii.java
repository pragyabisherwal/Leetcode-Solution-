class Solution {
    
    
    
    public void helper(int src ,int[] nums, List<Integer> temp , List<List<Integer>> result) 
    {
        if(src>=nums.length)
        {
            result.add(temp);
            return;
        }
        
        int num = nums[src];
        temp.add(num);
        helper(src+1 , nums , new ArrayList<>(temp) , result);
       
        temp.remove(temp.size()-1);
        
        while(src+1<nums.length && nums[src]==nums[src+1])
            src++;
        
        helper(src+1 , nums , temp, result); 
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        int N = nums.length;
        int idx=0;
        Arrays.sort(nums);
        
        List<List<Integer>>result = new ArrayList<> ();
        List<Integer> temp = new ArrayList<>();   
        
        helper(0 , nums , temp , result);
         
        return result;
        
    }
}