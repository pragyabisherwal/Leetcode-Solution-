class Solution {
   
    public int atMost(int[] nums , int k) 
    {
        int i=0 , j=0 , count=0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        int n = nums.length;
        
        
        while(j<n)
        {
            hm.put(nums[j] , hm.getOrDefault(nums[j] , 0)+1);
            
            if(hm.size()<=k)
            {
                count += j-i+1;
                j++;
            }
            
            else if(hm.size()>k)
            {
                while(hm.size()>k)
                {
                    int val = hm.get(nums[i]);
                    val--;
                    
                    if(val==0)
                        hm.remove(nums[i]);
                    
                    else
                        hm.put(nums[i] , val);
                    
                    i++;
                    
                }
                
                count+=j-i+1;
                j++;
            }
        }
        
        return count;
        
    }
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        return atMost(nums , k)-atMost(nums , k-1);
    }
}