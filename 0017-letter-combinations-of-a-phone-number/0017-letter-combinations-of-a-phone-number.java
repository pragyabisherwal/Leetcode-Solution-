class Solution {
    
    List <String> list = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");
    
    public ArrayList <String> possiblity(String digits){
            
        if(digits.length()==0){
               ArrayList <String> mres = new ArrayList<>(); 
                mres.add("");
                return mres;
            }
        
        char ch = digits.charAt(0);
        String rem = digits.substring(1);
        
        ArrayList <String> rres = possiblity(rem); 
        ArrayList <String> mres = new ArrayList<>(); 
        
        String codes = list.get(ch-'0');
        
        for(int j=0;j<codes.length();j++)
        {
          char code = codes.charAt(j);
          for(String rec : rres)
              mres.add(code + rec);
        }
        
        return mres;
    }
    
    public List<String> letterCombinations(String digits) 
    {
         if(digits.length()==0){
               ArrayList <String> mres = new ArrayList<>(); 
                return mres;
        }
        ArrayList <String> result = possiblity(digits);
        return result;
    }
    
}