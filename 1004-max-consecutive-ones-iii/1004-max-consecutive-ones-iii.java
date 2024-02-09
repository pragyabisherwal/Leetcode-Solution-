class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int i=0 , j=0;
        
        int max_len=0;
        int n = nums.length;
        
        while(j<n)
        {
           
           if(nums[j]==0)
             {   
                k--;  
             }

             if(k>=0)
            {
                max_len = Math.max(max_len , j-i+1);
                System.out.println(max_len);
            }

            else if(k<0)
            {
                  while(k<0)
                  {
                    if(nums[i]==0)
                        k++;
                    i++;
                  }
            max_len = Math.max(max_len , j-i+1);
            }
            
            j++;
        }
        
        return max_len;
    }
}