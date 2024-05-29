class Solution {
    public boolean check(int[] nums) {
        
        int irregularities = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {

            int current = nums[i];
            int nextPivoted = nums[(i + 1) % length];
            
            if (current > nextPivoted) 
            {
                irregularities += 1;
                
                if (irregularities >= 2) 
                {
                    return false;
                }
            }
        }

        return true;
    }
}