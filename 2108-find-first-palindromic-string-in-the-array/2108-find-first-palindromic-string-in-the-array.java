class Solution {
    
    public boolean check(String word)
    {
        int i=0;
        int j = word.length()-1;
        
        while(i<j)
        {
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(j);
            
            if(ch1!=ch2)
                return false;   
            i++;
            j--;
        }
        
        return true;
    }
    public String firstPalindrome(String[] words) 
    {
        for(int i=0;i<words.length; i++)
        {
            String word = words[i];
            
            if(check(word))
                return word;
        }
        
        return "";
    }
}