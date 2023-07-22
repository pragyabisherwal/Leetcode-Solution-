class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        
        for(int i = nums.length - 1; i >= 0; i--) {
            int e = nums[i];
            while(e > 0) {
                temp.add(e % 10);
                e /= 10;
            }
        }
        
        int[] res = new int[temp.size()];
        
        for(int i = 0; i < res.length; i++) {
            res[i] = temp.get(res.length - i - 1);
        }
        return res;
    }
}