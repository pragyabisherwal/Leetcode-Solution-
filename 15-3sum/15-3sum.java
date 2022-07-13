class Solution {
    
    List<List<Integer>> result = new ArrayList<> ();
    public void twoSum(int idx , int[] nums, int target) 
    {
        int A = nums[idx-1];
        int j = nums.length-1;
        
      
        while(idx<j)
        {
            if(nums[idx]+nums[j]>target)
            {
               j--; 
            }
            
            else if(nums[idx]+nums[j]<target)
            {
                idx++;
            }
            
            else
            {
                List<Integer>li = new ArrayList<> ();
                li.add(A);
                li.add(nums[idx]);
                li.add(nums[j]);
                
                result.add(li);
                
                //duplicate
                while(idx<j && nums[idx]==nums[idx+1])
                    idx++;
                while(idx<j && nums[j]==nums[j-1])
                    j--;
                
                idx++;
                j--;
            }
            
        }
        
    }
    public List<List<Integer>> threeSum(int[] nums) 
    {
 
        Arrays.sort(nums);
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if( i==0 || nums[i-1]!=nums[i])
             { 
               twoSum(i+1, nums , 0-nums[i]);
             }
        }
        
        return result;
    }
}