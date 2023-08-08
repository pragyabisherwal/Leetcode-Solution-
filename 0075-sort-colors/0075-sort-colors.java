class Solution {
    public void swap(int[]nums , int i , int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) 
    {
        int n = nums.length;
        int mid =0 , low=0;
        int high = n-1;
        
       while(mid<=high)
       {
           if(nums[mid]==0)
           {
               swap(nums , mid , low);
               mid++;
               low++;
           }
           
           else if(nums[mid]==1)
               mid++;
           
           else 
           {
              swap(nums , mid , high);
              high--;
           }
           
       }
    }
}