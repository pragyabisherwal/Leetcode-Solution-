//Tabulation
// class Solution {
//     public int lengthOfLIS(int[] nums) 
//     {
//         int [] dp = new int[nums.length];
//         dp[0]=1;
        
//         int max_Ans=1;
        
//         for(int i=1; i<dp.length ; i++)
//         {
//             int max=0;
//             for(int j=0 ; j<i; j++)
//             {
//                 if(nums[j]<nums[i])
//                 {
//                  if(max<dp[j])
//                     max=dp[j];
//                 }
               
//             }
            
//             dp[i]=max+1;
            
//             if(dp[i]>max_Ans)
//                 max_Ans=dp[i];
//         }
        
       
//         return max_Ans;
//     }
// }


/////////////////////------BINARY SEARCH----------------//////////////////////////////////////

class Solution {
    
    public int binarySearch(ArrayList<Integer> ans , int key)
    {
        int lo=0;
        int hi=ans.size()-1;
        
        while(lo<=hi)
        {
            int mid = lo + (hi - lo) / 2;
            
            if(ans.get(mid) == key)
                return mid;
            
             else if (ans.get(mid) < key) 
                lo = mid + 1;
            
             else 
                hi = mid - 1;
 
        }
        
        return hi+1;
    }
    public int lengthOfLIS(int[] nums) 
    {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        
        for(int i=1 ; i<n ; i++)
        {
            if(nums[i] > ans.get(ans.size()-1))
                ans.add(nums[i]);
            
            else
            {
                 int idx = binarySearch(ans, nums[i]);
                 ans.set(idx, nums[i]);
            }
        }
        
        return ans.size();
    }
}