class Solution {
    public void moveZeroes(int[] nums) 
    {
        int i=0;
        int count=0;
        
        for(int num: nums)
        {
            if(num!=0)
              {  
                nums[i]=num;
                i++;
              }
            
            else
                count++;
            
        }
        
        int n = nums.length-1;
        while(count>0)
        {
            nums[n]=0;
            n--;
            count--;
        }
    }
}