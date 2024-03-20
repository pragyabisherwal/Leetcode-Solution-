class Solution {
    public boolean contains(String word, char x)
    {
      int [] arr = new int[26];
      
        for(int i=0 ; i<word.length() ; i++)
        {
            char ch = word.charAt(i);
            arr[ch-'a']++;
        }
        
        if(arr[x-'a']>0)
            return true;
        
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> result = new ArrayList<>();
        for(int i=0 ; i<words.length ; i++)
        {
            boolean ans = contains(words[i] , x);
            
            if(ans)
                result.add(i);
            
        }
        
        return result;
    }
}