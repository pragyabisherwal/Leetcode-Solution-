class Solution {
    public int findPermutationDifference(String s, String t) 
    {
        ///BEST SOLUTION
        int res = 0;
        for(int i=0; i<s.length(); i++){
            res += Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return res;
        
        
        ///SECOND BEST SOLUTION
//         HashMap<Character , Integer> hm = new HashMap<>();
//         int sum = 0;
        
//         for(int i=0 ; i<t.length(); i++)
//             hm.put(t.charAt(i) , i);
        
//         for(int i=0 ; i<s.length() ; i++)
//         {
//             int ele1 = hm.get(s.charAt(i));
//             sum = sum + Math.abs(ele1 - i);
            
//         }
        
//         return sum;
    }
}