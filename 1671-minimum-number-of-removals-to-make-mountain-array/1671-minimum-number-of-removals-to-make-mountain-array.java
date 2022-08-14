class Solution {
// Implementation of Longest Bitonic Subsequence
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int [] lis = new int[n]; // longest Increasing Subsequece Array
        int [] lds = new int[n]; // longest Decreasing Subsequece Array
        
//     lis -> length of longest Increasing Subsequnce starting from 0th idx till ith idx
        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    max = Math.max(max, lis[j]);
                }
            }
            lis[i] = max + 1;
        }
        
//   lds -> length of longest Decreasing Subsequence starting from ith idx till end
        for(int i = n - 1; i >= 0; i--){ 
            int max = 0;
            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[i]){
                    max = Math.max(max, lds[j]);
                }
            }
            lds[i] = max + 1;
        }
        
        int max = 0;
        for(int i = 0; i < n; i++){
            if(lis[i] > 1 && lds[i] > 1) // if this ith elemenet is single then dont consider in the longest bitonic subsequence
            max = Math.max(max, lis[i] + lds[i]);
        }
        return n - (max - 1);
    }
}