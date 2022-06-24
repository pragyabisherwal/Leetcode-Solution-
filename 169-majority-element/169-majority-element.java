class Solution {
    
    public int candidate(int[] nums) 
    {
        int cand=nums[0];
        int count=1;
        
        for(int i=1 ; i<nums.length ; i++)
        {
            if(nums[i]!=cand)
            {
                count--;
            }
            
            else if(nums[i]==cand)
            {
                count++;
            }
            
            if(count==0)
            {
                cand=nums[i];
                count=1;
            }
        }
        
        return cand;
        
    }
    
    public boolean checkCandidate(int[] nums , int cand) 
    {
        boolean ans=false;
        int count=0;
      
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i]==cand)
            {
                count++;
            }
            
        }
        
        if(count>=nums.length/2)
            ans = true;
        
        return ans;
        
    }
    
    public int majorityElement(int[] nums) 
    {
        int cand= candidate(nums);
        boolean ans = checkCandidate(nums , cand);
        
        
        if(ans)
            return cand;
        
        else
            return -1;
        
    }
}