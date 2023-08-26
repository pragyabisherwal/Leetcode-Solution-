class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public static void swap(int[] arr, int si, int ei){
        int t = arr[si];
        arr[si] = arr[ei];
        arr[ei] = t;
    }
    
    public void helper(int[] nums , int index)
    {
        if(index>=nums.length)
        {
            List<Integer> temp = new ArrayList<>();
            for(int it : nums){
                temp.add(it);
            }
            result.add(temp);
            return;
        }
        
        for(int i = index ; i<nums.length ; i++)
        {
            swap(nums , index , i);
            helper(nums , index+1);
            swap(nums , index , i);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        helper(nums , 0 );
        
        return result;
        
        
    }
}