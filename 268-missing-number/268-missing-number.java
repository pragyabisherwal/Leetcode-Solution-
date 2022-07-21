class Solution {
   
     public int missingNumber(int[] nums) 
     {
//         HashMap <Integer , Integer> hm = new HashMap<> ();
        
//         for(int i=0 ; i<nums.length ; i++)
//         {
//            hm.put(nums[i] , 1);
//         }
        
        
//         int result=nums.length;
        
//          for(int i=0 ; i<nums.length ; i++)
//         {
//            if(hm.containsKey(i)==false)
//                result=i;
//         }
        

//         return result;
        
      int lim = nums.length;
      int sumt=lim*(lim+1)/2;
        
        
        int sumo=0;
        for(int i=0;i<lim;i++){
            sumo+=nums[i];
        }
        return sumt-sumo;
    }
        
        
    
}