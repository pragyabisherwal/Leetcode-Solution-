class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)==true)return true;
        if(s.length()!=goal.length())return false;
        
        for(int i=0;i<s.length();i++)
        {
           s=s.substring(1)+s.substring(0,1);
            if(s.equals(goal)==true)
            return true;

        }
        return false;
        
        
    }
}