class Solution {
    public boolean rotateString(String s, String goal) 
    {
        if (s.length() != goal.length())
            return false;
        
        Queue<Character> q1 = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i++) 
        {
                q1.add(s.charAt(i));
         }
        
        Queue<Character> q2 = new LinkedList<>();
        
        for (int i = 0; i < goal.length(); i++) 
        {
              q2.add(goal.charAt(i));
        }
        
        int k = q2.size();
        
        while(k>0)
        {
            k--; //Number of rotations to be made
            
            char rem = q2.remove();
            q2.add(rem);
            
            if(q2.equals(q1))
                return true;
        }
        
        return false;
        
    }
}