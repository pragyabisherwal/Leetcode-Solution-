class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0, j=0, res[]=new int[nums.length-k+1], c=0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(;j<nums.length; ++j) {
            pq.add(nums[j]);
            if(j-i+1>k){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
                ++i;
            }
            while(map.containsKey(pq.peek())) {
                int pop = pq.poll(), f;
                map.put(pop, (f=map.get(pop)-1));
                if(f==0) map.remove(pop);
            }
            if(j-i+1==k)
                res[c++] = pq.peek();
        }
        return res;
    }
}