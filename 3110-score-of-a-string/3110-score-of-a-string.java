class Solution {
    public int scoreOfString(String s) 
    {
        int n = s.length()-1;
        int sum = 0;
        for(int i=0 ; i<n ; i++)
        {
            int ele1 = (int)s.charAt(i);
            int ele2 = (int)s.charAt(i+1);
            
            
            sum = sum + Math.abs(ele1 - ele2);
            
        }
        
        return sum;
        
    }
}