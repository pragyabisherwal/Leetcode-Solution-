class Solution {
    
     
    
    public void helper(int src ,int[] nums, List<Integer> temp , List<List<Integer>> result) 
    {
        if(src>=nums.length)
        {
            result.add(temp);
            return;
        }
        
        helper(src+1 , nums , new ArrayList<>(temp) , result);
        int num = nums[src];
        temp.add(num);
        helper(src+1 , nums , temp, result);
        
    }
    
    public List<List<Integer>> subsets(int[] nums) 
    {
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> temp = new ArrayList<>();   
         helper(0 , nums , temp , result);
         
        return result;
        
    }
}