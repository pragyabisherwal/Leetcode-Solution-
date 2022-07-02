class Solution {
    
    List<List<Integer>> al = new ArrayList<> ();
    
    public void helper(int[] nums , List <Integer> temp)
    {
        if(temp.size() == nums.length)
        {
            al.add(new ArrayList<> (temp)); 
        }
        
        else
            
        {
            for(int i=0 ; i<nums.length ; i++)
            {
                int myNum=nums[i];

                if(temp.contains(myNum))
                    continue;
                else
                {
                temp.add(myNum);
                helper(nums , temp);
                temp.remove(temp.size()-1);
                }
                
            }
        }
       
    }
    
    public List<List<Integer>> permute(int[] nums) 
    {
     List <Integer> temp = new ArrayList<> ();
     helper(nums , temp);  
     return al;
    }
}