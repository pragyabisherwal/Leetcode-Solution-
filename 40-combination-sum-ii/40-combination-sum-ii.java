class Solution {
    
    List<List<Integer>> result = new ArrayList<> ();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<Integer> temp = new ArrayList<> ();
        Arrays.sort(candidates);
        helper(0 , candidates , target , temp);
        return result;
    }
    
    public void helper(int src , int[] candidates, int target ,  List<Integer> temp)
    {
        if(target==0)
        {
            result.add( new ArrayList<> (temp));
            return;
        }
        
        if(target<0 || src>=candidates.length)
            return;
        
        for(int i=src ; i<candidates.length ; i++)
        {
            if(i!=src && candidates[i]==candidates[i-1])
                continue;
            
            temp.add(candidates[i]);
            helper(i+1 , candidates , target-candidates[i], temp);
            temp.remove(temp.size()-1);
        }
    }
}