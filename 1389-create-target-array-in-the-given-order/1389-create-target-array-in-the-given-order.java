class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int n = index.length;
        int [] target = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0 ; i<n ; i++)
        {
            int idx = index[i];
            int val = nums[i];
            
            ans.add(idx , val);
        }
        
        for(int i=0 ; i<n ; i++)
        {
            target[i]=ans.get(i);
               
        }
        
        return target;
        
    }
}