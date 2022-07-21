class Solution {
    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void reverse(int[] nums, int i, int j) 
    {
       while(i < j) 
        { 
           swap(nums, i, j);
            i++;
            j--;
       }
   }
    
    public void nextPermutation(int[] nums) 
    {
        if(nums==null || nums.length<=1)
            return;
        
        int index1=-1;
        
        for(int i=nums.length-2; i>=0 ; i--)
        {
            if(nums[i]<nums[i+1] )
            {
                index1=i;
                break;
            }
        }
        
       // System.out.println(index1);


        if(index1>=0)
        {
            for(int i=nums.length-1; i>=0 ; i--)
           {
            if(nums[index1] < nums[i] )
                {
                    swap(nums , index1 , i);
                    break;
                }
           } 
        }

       reverse(nums , index1+1 , nums.length-1);
        
    }
}