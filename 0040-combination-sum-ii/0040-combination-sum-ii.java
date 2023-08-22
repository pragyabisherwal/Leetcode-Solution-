class Solution {
    
    List<List<Integer>> result = new ArrayList<> ();
    
     public void helper(int[] candidates, int idx , int sum , int target,List<Integer> ans, List<List<Integer>> result)
    {
        if(sum == target)
        {
            result.add(new ArrayList<>(ans));
            return;
        }
        
        if(sum>target || idx>=candidates.length)
            return;
         
         //PICKING THE ELEMENT
        int num = candidates[idx];
        sum+=num;
        ans.add(num);
        
        helper(candidates , idx+1 , sum , target , ans , result);
        
        
        //BACKTRACKING
        sum-=num;
        ans.remove(ans.size()-1);
         
        //NOT PICKING
         while(idx+1<candidates.length && candidates[idx]==candidates[idx+1])
                idx++;
         
        helper(candidates , idx+1 , sum , target , ans , result);
    }
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates , 0 , 0 , target , ans , result);
       
        return result;
    }
    
}