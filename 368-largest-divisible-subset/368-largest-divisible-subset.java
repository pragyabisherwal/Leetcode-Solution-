class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        //STEP-1  SORTING
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0)
            return al;
       
        
        //STEP-2 APPLYING DP AND FINDING THE MAXIMUM LENGTH 
        int [] dp = new int[n];
        Arrays.fill(dp , 1);
        
        int max = 1;
        
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<i ; j++)
            {
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i])
                 {  
                    dp[i]=1+dp[j];
                     
                    if(dp[i]>max)
                        max=dp[i];
                 }
            }
            
        }
        
        //System.out.println(max);
        
        //STEP-3 USING THE MAX LENGTH FINDING THE SUBSET
        int prev = -1;
        
        for(int i=n-1; i>=0 ; i--)
        {
            if(dp[i]==max && (prev%nums[i]==0 || prev==-1))
            {
                al.add(nums[i]);
                max=max-1;
                prev = nums[i];
            }
        }
        
        return al;
    }
}