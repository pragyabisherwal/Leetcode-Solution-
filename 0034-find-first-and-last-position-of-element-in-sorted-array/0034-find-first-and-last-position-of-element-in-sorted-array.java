class Solution {
    public int[] searchRange(int[] a, int t) {
        int[] ans={-1,-1};
        
        ans[0]=searchFirst(a,t);
        ans[1]=searchLast(a,t);
        return ans;
    }
    
    public static int searchFirst(int[] a,int t)
    {
        int start=0;
        int end=a.length-1;
        
        int ans=-1;
        
        while(start<=end)
        {
            int mid=start + (end-start)/2;
            
            if(a[mid]==t)
            {
                ans = mid;
                end = mid-1;
            }
            
            else if(a[mid]>t)
                end=mid-1;
            
            else 
                start=mid+1;
            
        }
        return ans;
    }
    
    public static int searchLast(int[] a,int t)
    {
        int start=0;
        int end=a.length-1;
        
        int ans=-1;
        
        while(start<=end)
        {
            int mid=start + (end-start)/2;
            
            if(a[mid]==t)
            {
                ans = mid;
                start = mid+1;
            }
            
            else if(a[mid]>t)
                end=mid-1;
            
            else 
                start=mid+1;
            
        }
        return ans;
    }
}