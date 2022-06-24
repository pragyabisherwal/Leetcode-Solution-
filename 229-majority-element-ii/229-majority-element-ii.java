class Solution {
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
        
        if(count>nums.length/3)
            ans = true;
        
        return ans;
 
    }
    public List<Integer> majorityElement(int[] nums) 
    {
        int cand1=-1;
        int cand2=-1;
         
        int count1=0;
        int count2=0;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==cand1)
            {
                count1++;
            }
            
            else if(nums[i]==cand2)
            {
                count2++;
            }
            
            else if(count1==0)
            {
                cand1=nums[i];
                count1=1;
            }
            
            else if(count2==0)
            {
                cand2=nums[i];
                count2=1;
            }
            
            else
            {
                count1--;
                count2--; 
            }
        }
        
         List<Integer> result = new ArrayList<> ();
        
        if(cand1==cand2)
        {
            boolean ans1=checkCandidate(nums , cand1);
            
             if(ans1)
             result.add(cand1);
        }
        
        
       else if(cand1!=cand2)
       {
            boolean ans1=checkCandidate(nums , cand1);
            boolean ans2=checkCandidate(nums , cand2);

            if(ans1)
                result.add(cand1);
            if(ans2)
                result.add(cand2);  
       }
        
        
        
        return result;
        
    }
}