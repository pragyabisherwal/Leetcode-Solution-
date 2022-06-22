class Solution {
    public int missingNumber(int[] nums) 
    {
        HashMap <Integer , Integer> hm = new HashMap<> ();
        
        for(int i=0 ; i<nums.length ; i++)
        {
           hm.put(nums[i] , 1);
        }
        
        
        int result=nums.length;
        
         for(int i=0 ; i<nums.length ; i++)
        {
           if(hm.containsKey(i)==false)
               result=i;
        }
        

        return result;
        
        
        
    }
}