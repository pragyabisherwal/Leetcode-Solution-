class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int n = nums.length;
        int i=0 , j=0 , count=0 ,eveNum=0;
        int maxNum=0;
        
        while(j<n)
        {
            if (nums[j] % 2 != 0) {
                count++;
                eveNum=0; // Reset the count of subarrays
            }
           
            while(count==k)
            {
                count = (nums[i] % 2 != 0) ? count - 1 : count;

                i++;
                eveNum++;  
            }
            
            maxNum+=eveNum;
            j++;
            
        }
        
        return maxNum;
        
    }
}