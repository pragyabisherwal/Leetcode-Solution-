class Solution {
    public String convertToTitle(int col) 
    {
        StringBuilder str = new StringBuilder();
        
        while(col>0)
        {
            int rem = (col-1)%26;
            str.append((char)('A' + rem));
            col = (col-1)/26; 
        }
        
        str.reverse();
        return str.toString();
    
    }
}