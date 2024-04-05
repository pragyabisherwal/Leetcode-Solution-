class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
       
        int n = arr.length;
        
        if(arr[0]>k)
            return k;
        
        if(arr[n-1]-n<k)
            return k+n;
        
        int start = 0 , end =n-1;
        int missing=0;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            missing = arr[mid]-(mid+1);
            
            if(missing>=k)
                end=mid-1;
            else
                start=mid+1;
        }
        return start+k;
    }
}