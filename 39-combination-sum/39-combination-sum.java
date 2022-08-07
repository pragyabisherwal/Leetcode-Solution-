class Solution {
    
    List<List<Integer>> li = new ArrayList<> ();
    
    public void solve(int src ,int target, List<Integer> temp ,  List<List<Integer>> li , int[] candidates)
    {
        if(target==0)
        {
            li.add(new ArrayList(temp));
        }
        
        if(target<0)
            return;
        
        for(int i=src; i<candidates.length; i++)
        {
            temp.add(candidates[i]);
            solve(i,target-candidates[i], temp ,li,candidates);
            temp.remove(temp.size()-1);
        }
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
      
        List<Integer> temp = new ArrayList<> ();
        solve(0,target ,temp,li,candidates);
        return li;
        
    }
}