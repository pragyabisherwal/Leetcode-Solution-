class Solution {
    
    public void reverse(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) 
    {
        char [] str = s.toCharArray();
        int n = str.length;
        
        for(int i=0 ; i<n ; i=i+2*k)
        {
            if(i+k-1 <= n-1){
                reverse(i,i+k-1,str);
            }
            else{
                reverse(i , n-1 , str);
            }
        }
        
       String ans = new String(str);
       return ans;
    }
}