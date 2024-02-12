class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0, j = 0, c = 0, total = 0, count = 0;

        // Iterate through the array using two pointers i and j
        while (j < nums.length) {
            // If the current element is odd, increment the count of odd numbers (c)
            if (nums[j] % 2 != 0) {
                c++;
                count = 0; // Reset the count of subarrays
            }

            // Check if the count of odd numbers is equal to k
            while (c == k) {
                // Decrease the count of odd numbers and move the left pointer (i) to the right
                c = (nums[i] % 2 != 0) ? c - 1 : c;
                i++;
                count++; // Increment the count of subarrays
            }

            // Add the count of subarrays to the total
            total += count;

            // Move the right pointer (j) to the right
            j++;
        }

        // Return the total number of subarrays with at least k odd numbers
        return total;
    }
}