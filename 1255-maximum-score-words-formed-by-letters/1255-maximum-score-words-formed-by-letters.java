class Solution {
    public int solution(String[] words, int[] farr, int[] score , int idx)
    {
        if(idx==words.length)
            return 0;
        
        int noCall=0;
         noCall = solution(words , farr , score , idx+1); 
        
        int scoreWord=0;
        String word = words[idx];
        boolean flag = true;
        
        for(int i=0 ; i<word.length() ; i++)
        {
            char ch = word.charAt(i);
            
            if(farr[ch-'a']==0)
            {
                flag = false;
            }
            
            farr[ch-'a']--;
            
            scoreWord+=score[ch-'a'];
        }
        
         int yesCall=0;
            
            if(flag==true)
            {
                yesCall= scoreWord + solution(words , farr , score , idx+1); 
            }
            
            for(int l=0;l<word.length();l++){
             char rt=word.charAt(l);
             farr[rt - 'a']++;
            }
        
        return Math.max(noCall,yesCall);
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) 
    {
        int[] farr=new int[26];
        for(int i=0;i<letters.length;i++)
        {
             char ch=letters[i];
             farr[ch-'a']++;
        }
        
        int result=solution(words , farr , score , 0);
        return result;
    }
}