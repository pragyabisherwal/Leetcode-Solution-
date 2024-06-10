public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        //Checkout leetcode notes of this question 
        
//         //NOTES      ---------------------------------------------------->>>>>>>>>
        int i = 0;
        long currSum = 0;
        
        for (int j = 0; j < n; j++) {
            
            long target = nums[j];
            currSum += nums[j];
            
            if ((j - i + 1) * target - currSum > k) {
                currSum -= nums[i];
                i++;
            }
            
            result = Math.max(result, j - i + 1);
            
        }
        return result;
    }
}   
//FOR EXPLANATION |||||  this will not pass due to some long int conversion issue.But is good to understand how code works
                    
// class Solution {
//     public int maxFrequency(int[] nums, int k) {
//         Arrays.sort(nums);
//         int left = 0, right = 0;
//         long current_sum = 0 , original_sum = 0;

//         int window_sum = 0,operations = 0;
//         int result = 0;
//         for (;right < nums.length;right++) {
//             long target = nums[right];
//             current_sum += nums[right];

//             window_sum = (right - left + 1)*(int) target;
//             original_sum = current_sum;

//             operations = (int)(window_sum - original_sum);

//             if (operations > k) {
//                 current_sum -= nums[left];
//                 left++;

//                 window_sum = (right - left + 1)*(int)target;
//                 original_sum = current_sum;

//             operations = (int)(window_sum - original_sum);
//             }

//             result = Math.max(result, right - left + 1);
            
//         }

//         return result;
//     }
// }
