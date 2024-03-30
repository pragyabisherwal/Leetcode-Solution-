class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int res=-1;
        int n = letters.length;
        int start=0 , end = n-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(letters[mid]<=target)
                start = mid+1;
            
            else if(letters[mid]>target)
            {
                res = mid;
                end = mid-1;
            }
                
        }
        
        if(res==-1)
            return letters[0];
        
        return letters[res];
    }
}