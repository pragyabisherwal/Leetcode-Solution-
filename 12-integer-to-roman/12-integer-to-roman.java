class Solution {
    public String intToRoman(int num) 
    {
        int [] valueCodes = {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String [] codes = {"M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I"};
        String ans="";
        
        for(int i=0 ; i<valueCodes.length ; i++)
        {
            while(num>=valueCodes[i])
            {
              ans+=codes[i];
                num = num-valueCodes[i];
            }
        }
        
        return ans;
        
    }
}