class Solution {
    public String reverseVowels(String s) 
    {
        String check = "aeiouAEIOU";
        
        StringBuilder sb = new StringBuilder(s);
        int l=0;
        int r=sb.length()-1;
        
        
        while(l<r)
        {
            
            while(l<r && check.indexOf(sb.charAt(l))==-1)
            {
                l++;
            }
            
             while(l<r && check.indexOf(sb.charAt(r))==-1)
            {
                r--;
            }
            
            char temp = sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,temp);
            l++;
            r--;
        }
        
        return sb.toString();

    }
}