class Solution {
    public void helper(int[] candidates, int idx , int sum , int target,List<Integer> ans, List<List<Integer>> result)
    {
        if(sum == target)
        {
            result.add(new ArrayList<>(ans));
            return;
        }
        
        if(sum>target || idx>=candidates.length)
            return;
        
        helper(candidates , idx+1 , sum , target , ans , result);
        
        int num = candidates[idx];
        sum+=num;
        ans.add(num);
        
        helper(candidates , idx , sum , target , ans , result);
        
        sum-=num;
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        helper(candidates , 0 , 0 , target , ans , result);
        return result;
        
    }
}