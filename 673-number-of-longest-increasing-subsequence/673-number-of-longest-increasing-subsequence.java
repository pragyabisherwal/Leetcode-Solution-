class Solution {
    public int findNumberOfLIS(int[] nums) 
    {
        int[]lis=new int[nums.length];
        int[]count=new int[nums.length];
        
        Arrays.fill(lis,1);
        Arrays.fill(count,1);
        
        int max=1;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                //If subsequence length more inc it and updating the count
                if(nums[i]>nums[j] && lis[i]<lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                    count[i]=count[j];
                }
                
                //If length equal means one more sequence of the same length so total sequence will                   be earlier + ending on to the current
                else if(nums[i]>nums[j]&&lis[i]==lis[j]+1)
                {
                    count[i]+=count[j];
                }
                
            }
            max=Math.max(max,lis[i]);
       }  
        
      //In LIS whichever have len equal to max length adding all the possible count of it.
      int res=0;
      for(int i=0;i<nums.length;i++)
      {
          if(lis[i]==max)
          {
              res+=count[i];

          }
      }
    return res;
        
    
    }
}