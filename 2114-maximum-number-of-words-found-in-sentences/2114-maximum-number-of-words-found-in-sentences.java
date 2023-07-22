class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int n = sentences.length;
        int maxWords=0;
        
        for(int i=0 ; i<n ; i++)
        {
            String temp = sentences[i];
            char [] charArray = temp.toCharArray();
            int count=0;
            
            for(int j=0 ; j<charArray.length ; j++)
            {
                if(charArray[j] == ' ')
                {
                    count++;
                }
            }
            
            if(count>maxWords)
                maxWords=count;
        }
        
        maxWords+=1;
        return maxWords;
        
        
    }
}