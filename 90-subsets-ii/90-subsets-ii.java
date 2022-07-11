class Solution {
    
    List<List<Integer>>result = new ArrayList<> ();
    
    
    public void helper(int[] nums , int N , int idx , List<Integer> temp)
    {
        result.add(new ArrayList<> (temp));
         
        for(int i= idx;i<N;i++)
        {
            if(idx!=i && nums[i]==nums[i-1]) continue;
            
            int val = nums[i];
            
            temp.add(val);
            helper(nums , N , i+1 , temp);
            temp.remove(temp.size()-1);
        }

    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int N = nums.length;
        int idx=0;
        Arrays.sort(nums);
        
        helper(nums , N , idx , new ArrayList<> ());
        return result;
        
    }
}