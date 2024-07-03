class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==1)
            return strs[0];
        
        String prefix=strs[0];
        //System.out.println(prefix);
        for(int i=1 ; i<strs.length ; i++)
        {
            
            //When prefix string size length is zero indexOf function return 0 so in that case we need to break the while loop so that we can return answer as an empty string that's why we have condition strs[i].indexOf(prefix)!="0"
            
            while(strs[i].indexOf(prefix)!=0)
            {
                //System.out.println(strs[i].indexOf(""));
                prefix = prefix.substring(0 , prefix.length()-1);
            }
            
            
            if(prefix.length()==0)
                return "";
        }
        
        return prefix;
        
    }
}