class Solution {
    public int findPermutationDifference(String s, String t) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();
        int sum = 0;
        
        for(int i=0 ; i<t.length(); i++)
            hm.put(t.charAt(i) , i);
        
        for(int i=0 ; i<s.length() ; i++)
        {
            int ele1 = hm.get(s.charAt(i));
            sum = sum + Math.abs(ele1 - i);
            
        }
        
        return sum;
    }
}