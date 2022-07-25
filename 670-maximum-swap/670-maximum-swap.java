class Solution {
    public int maximumSwap(int num) 
    {
       char [] nums = (num+"").toCharArray();
       
        int [] right = new int[nums.length];
        
        for(int i=nums.length-1; i>=0 ; i--)
        {
            if(i==nums.length-1)
            {
                right[i]=-1;
            }
            
            else if(i==nums.length-2)
            {
                right[i]=nums.length-1;
            }
            
            else
            {
                char first = nums[i+1];
                char second = nums[right[i+1]];
                
                if( first > second)
                {
                   right[i]=i+1;
                }
                
                else
                {
                    right[i]=right[i+1];  
                }
            }
                
        }
        
        
        
        for(int i=0 ; i<nums.length-1; i++)
        {
             char first = nums[i];
             char second = nums[right[i]];
            
            if(first<second)
            {
                //swapping the both numbers
                char temp = nums[i];
                nums[i]=nums[right[i]];
                nums[right[i]]=temp;
                
                break;
            }
        }
        
        
        return Integer.parseInt(new String(nums));
        
        
        
    }
}